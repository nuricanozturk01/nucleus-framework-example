package com.nuricanozturk.nucleus.test.di;


import com.nuricanozturk.nucleus.annotation.Component;

@Component("test")
public class NamedBeanComponentTestTwo {
  private static final String TEST = "TEST FOR DI";

  public NamedBeanComponentTestTwo() {
    System.out.println("Named bean component test two created");
  }

  public void write() {
    System.out.println(TEST);
  }
}
