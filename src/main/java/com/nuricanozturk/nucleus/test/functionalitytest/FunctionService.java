package com.nuricanozturk.nucleus.test.functionalitytest;

import com.nuricanozturk.nucleus.annotation.BackOff;
import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.annotation.Recover;
import com.nuricanozturk.nucleus.annotation.Repeat;
import com.nuricanozturk.nucleus.annotation.Retryable;
import com.nuricanozturk.nucleus.annotation.Scheduled;
import com.nuricanozturk.nucleus.test.exception.MyException;

@Component
public class FunctionService {
  private int attempt = 0;

  @Retryable(
          retryFor = MyException.class,
          maxAttempts = 5,
          recover = "recoverMethod",
          backOff = @BackOff(delay = 1000, multiplier = 2))
  public void retryableMethod() {
    this.attempt++;
    System.out.println("Attempt: " + this.attempt);
    if (this.attempt <= 5) {
      throw new MyException("Failing attempt " + this.attempt);
    }
    System.out.println("Success on attempt " + this.attempt);
  }

  @Recover
  public void recoverMethod(final RuntimeException e) {
    System.out.println("Recovery logic triggered. Last error: " + e.getMessage());
  }

  @Repeat(value = 5, delay = 1_500L)
  public void sayHello() {
    System.out.println("Helloooo!");
  }

  @Scheduled(cron = "*/3 * * * * *")
  public void myScheduledJob() {
    this.sayHello();
  }

  public String testStr() {
    return "Test str";
  }
}
