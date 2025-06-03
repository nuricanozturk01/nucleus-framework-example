package com.nuricanozturk.nucleus.test.di;


import com.nuricanozturk.nucleus.annotation.Component;
import com.nuricanozturk.nucleus.annotation.Qualifier;
import com.nuricanozturk.nucleus.test.di.namedbean.NamedBeanService;
import org.jetbrains.annotations.NotNull;

@Component
public class NamedBeanQualifierTest {
  public NamedBeanQualifierTest(
          final @NotNull @Qualifier("named1") NamedBeanService service,
          final @NotNull @Qualifier("named2") NamedBeanService service2) {
    System.out.println("Named bean qualifier test created");
    service.write();
    service2.write();
    System.out.println("Named bean qualifier test finished");
  }
}