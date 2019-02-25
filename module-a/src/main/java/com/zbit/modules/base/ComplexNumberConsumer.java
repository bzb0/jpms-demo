package com.zbit.modules.base;

import java.lang.reflect.Method;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.math3.complex.Complex;

public class ComplexNumberConsumer {

  private ThreadLocalRandom random = ThreadLocalRandom.current();

  public void printComplexNumber(Complex complex) {
    Complex moduleComplex = new Complex(5, 2);
    System.out.println(moduleComplex.add(complex));

    System.out.println("Modulepath classloader: "
        + moduleComplex.getClass().getClassLoader().getName());
  }

  public Complex getComplexNumber() {
    try {
      Class c = Class.forName("com.zbit.math.complex.ComplexCreator");
      Method m = c.getMethod("createComplexNumber", double.class);

      Object instance = c.getDeclaredConstructor().newInstance();
      System.out.println("Classpath classloader: "
          + instance.getClass().getClassLoader().getName());

      return (Complex) m.invoke(instance, random.nextDouble());
    } catch (Throwable e) {
      System.err.println(e);
      throw new IllegalStateException("Reflection problem.");
    }
  }
}