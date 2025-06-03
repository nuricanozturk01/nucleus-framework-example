package com.nuricanozturk.nucleus.test;

import com.nuricanozturk.nucleus.NucleusApplication;
import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.annotation.EntryPoint;
import com.nuricanozturk.nucleus.annotation.NucleusFramework;
import org.jetbrains.annotations.NotNull;

@NucleusFramework
@EntryPoint("start")
public class Main {
  private final @NotNull App app;

  public Main(final @NotNull App app) {
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