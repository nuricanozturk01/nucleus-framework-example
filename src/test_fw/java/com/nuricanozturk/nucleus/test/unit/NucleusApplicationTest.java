package com.nuricanozturk.nucleus.test.unit;

import com.nuricanozturk.nucleus.NucleusApplication;
import com.nuricanozturk.nucleus.annotation.ComponentScan;
import com.nuricanozturk.nucleus.annotation.EntryPoint;

import nuricanozturk.dev.annotation.TestFrameworkApplication;
import nuricanozturk.dev.app.TestFrameworkApp;
import nuricanozturk.dev.display.DisplayType;

@TestFrameworkApplication
@ComponentScan(basePackages = "com.nuricanozturk.nucleus.test.unit")
@EntryPoint
public class NucleusApplicationTest {
  public static void main(String[] args) {
    NucleusApplication.run(NucleusApplicationTest.class);
    TestFrameworkApp.run(NucleusApplicationTest.class, DisplayType.Console);
  }

  public void run() {
    System.out.println("Test Application started");
  }
}
