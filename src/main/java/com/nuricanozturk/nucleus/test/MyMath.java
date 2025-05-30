package com.nuricanozturk.nucleus.test;

import com.nuricanozturk.nucleus.annotation.Component;

@Component
public class MyMath {
  public int sum(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }
}
