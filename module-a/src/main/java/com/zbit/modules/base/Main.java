package com.zbit.modules.base;

import com.zbit.modules.sorter.spi.SorterService;
import com.zbit.strings.util.StringCreator;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.math3.complex.Complex;

public class Main {

  public static void main(String[] args) {
    System.out.format("Hello World: " + new StringCreator().generateRandomString() + "\n");

    List<Integer> unsortedList = Stream.generate(() -> new Random().nextInt(50)).limit(15)
        .collect(Collectors.toList());
    System.out.println("Unsorted List: \t" + unsortedList);

    SorterService sorter = getSorterService();
    sorter.sort(unsortedList);
    System.out.println("Sorted List  : \t" + unsortedList);

    /* Using a class from a module, that is not required by module A.
     * The class here is not imported, since we don't do anything with object.
     * Still we can't call methods on the object from type Pair.  */
    System.out.println("Pair: " + new StringCreator().createPair("a", "b"));

    /* Testing a runtime access to classes from other modules. */
    runtimeAccess();


    /* Reflective access to a class from the classpath. :) */
    ComplexNumberConsumer consumer = new ComplexNumberConsumer();
    Complex complexNumber = consumer.getComplexNumber();
    consumer.printComplexNumber(complexNumber);
  }

  private static void runtimeAccess() {
    try {
      Class c = Class.forName("com.zbit.reflective.ReflectiveClass");
      Method m = c.getMethod("getSomething");

      Object instance = c.getDeclaredConstructor().newInstance();
      System.out.println("Result: " + m.invoke(instance));
    } catch (Throwable e) {
      System.err.println(e);
    }
  }

  private static SorterService getSorterService() {
    ServiceLoader<SorterService> sl = ServiceLoader.load(SorterService.class);
    Optional<SorterService> sorterService = sl.findFirst();
    if (sorterService.isEmpty()) {
      throw new RuntimeException("No service providers found!");
    }
    return sorterService.get();
  }
}