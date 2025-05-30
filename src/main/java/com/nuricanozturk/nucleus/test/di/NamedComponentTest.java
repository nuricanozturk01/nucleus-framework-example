package com.nuricanozturk.nucleus.test.di;


import com.nuricanozturk.nucleus.annotation.Component;

@Component("test2")
public class NamedComponentTest {
  public void write() {
    System.out.println("Hello World!");
  }
}
