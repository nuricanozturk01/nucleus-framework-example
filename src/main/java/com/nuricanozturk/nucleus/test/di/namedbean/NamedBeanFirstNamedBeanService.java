package com.nuricanozturk.nucleus.test.di.namedbean;

import com.nuricanozturk.nucleus.annotation.Component;

@Component("named1")
public class NamedBeanFirstNamedBeanService implements NamedBeanService {
  public NamedBeanFirstNamedBeanService() {
    System.out.println("First named bean created");
  }

  @Override
  public void write() {
    System.out.println("Hello World from first named bean");
  }
}