package com.nuricanozturk.nucleus.test;

import com.nuricanozturk.nucleus.annotation.Component;

@Component
public class MyMath {
  public int sum(final int a, final int b) {
    return a + b;
  }

  public int sub(final int a, final int b) {
    return a - b;
  }
}
