package com.nuricanozturk.nucleus.test.unit;


import com.nuricanozturk.nucleus.annotation.Autowired;
import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.di.NucleusInjectionHelper;
import com.nuricanozturk.nucleus.test.MyMath;
import nuricanozturk.dev.annotation.DisplayName;
import nuricanozturk.dev.annotation.TestClass;
import nuricanozturk.dev.annotation.UnitTest;
import nuricanozturk.dev.check.Check;

@TestClass
@Component
public class MyNucleusTest {
  @Autowired
  private MyMath math;

  public MyNucleusTest() {
    NucleusInjectionHelper.inject(this);
  }

  @DisplayName("Is 1 + 2 = 3")
  @UnitTest
  public void testSum() {
    Check.checkEqual(3, this.math.sum(1, 2));
  }

  @DisplayName("Is 1 - 2 = -1")
  @UnitTest
  public void testSub() {
    Check.checkEqual(-1, this.math.sub(1, 2));
  }
}
