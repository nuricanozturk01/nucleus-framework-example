package com.nuricanozturk.nucleus.test;

import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.test.di.NamedBeanComponentTestTwo;
import com.nuricanozturk.nucleus.test.di.NamedComponentTest;
import com.nuricanozturk.nucleus.test.functionalitytest.FunctionService;
import org.jetbrains.annotations.NotNull;

@Component
public class App {
  private final @NotNull FunctionService functionService;
  private final @NotNull NamedBeanComponentTestTwo namedBeanComponentTestTwo;
  private final @NotNull NamedComponentTest namedComponentTest;

  public App(
      final @NotNull FunctionService functionService,
      final @NotNull NamedBeanComponentTestTwo namedBeanComponentTestTwo,
      final @NotNull NamedComponentTest namedComponentTest) {
    this.functionService = functionService;
    this.namedBeanComponentTestTwo = namedBeanComponentTestTwo;
    this.namedComponentTest = namedComponentTest;
  }

  public void run() {
    this.namedBeanComponentTestTwo.write();
    System.out.println("---------------------");
    this.namedComponentTest.write();
    System.out.println("---------------------");
    this.functionService.retryableMethod();
  }
}