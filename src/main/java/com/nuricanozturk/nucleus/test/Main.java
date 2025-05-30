package com.nuricanozturk.nucleus.test;

import com.nuricanozturk.nucleus.NucleusApplication;
import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.annotation.EntryPoint;
import com.nuricanozturk.nucleus.annotation.NucleusFramework;

@NucleusFramework
@EntryPoint("start")
@Component
public class Main {
  private final App app;

  public Main(final App app) {
    this.app = app;
  }

  public static void main(final String[] args) {
    NucleusApplication.run(Main.class);
  }

  public void start() {
    System.out.println("Application started");
    this.app.run();
  }
}