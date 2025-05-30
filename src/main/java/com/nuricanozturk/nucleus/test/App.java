package com.nuricanozturk.nucleus.test;

import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.test.di.NamedBeanComponentTestTwo;
import com.nuricanozturk.nucleus.test.di.NamedComponentTest;
import com.nuricanozturk.nucleus.test.functionalitytest.FunctionService;

@Component
public class App {
  private final FunctionService functionService;
  private final NamedBeanComponentTestTwo namedBeanComponentTestTwo;
  private final NamedComponentTest namedComponentTest;

  public App(FunctionService functionService, NamedBeanComponentTestTwo namedBeanComponentTestTwo, NamedComponentTest namedComponentTest) {
    this.functionService = functionService;
    this.namedBeanComponentTestTwo = namedBeanComponentTestTwo;
    this.namedComponentTest = namedComponentTest;
  }

  public void run() {
    functionService.retryableMethod();
    System.out.println("---------------------");
    namedBeanComponentTestTwo.write();
    System.out.println("---------------------");
    namedComponentTest.write();
  }
}