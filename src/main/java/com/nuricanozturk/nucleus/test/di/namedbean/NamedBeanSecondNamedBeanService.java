package com.nuricanozturk.nucleus.test.di.namedbean;


import com.nuricanozturk.nucleus.annotation.Component;

@Component("named2")
public class NamedBeanSecondNamedBeanService implements NamedBeanService {
  public NamedBeanSecondNamedBeanService() {
    System.out.println("Second named bean created");
  }

  @Override
  public void write() {
    System.out.println("Hello World from second named bean");
  }
}