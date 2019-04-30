/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zbit.modules.base;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.math3.complex.Complex;

public class ComplexNumberConsumer {

  private ThreadLocalRandom random = ThreadLocalRandom.current();

  public void printComplexNumber(Complex complex) {
    Complex moduleComplex = new Complex(5, 2);
    System.out.println(moduleComplex.add(complex));
    System.out.println("Modulepath classloader: " + moduleComplex.getClass().getClassLoader().getName());
  }

  public Optional<Complex> getComplexNumber() {
    try {
      Class c = Class.forName("com.zbit.math.complex.ComplexCreator");
      Method m = c.getMethod("createComplexNumber", double.class);

      Object instance = c.getDeclaredConstructor().newInstance();
      System.out.println("Classpath classloader: " + instance.getClass().getClassLoader().getName());

      return Optional.of((Complex) m.invoke(instance, random.nextDouble()));
    } catch (ReflectiveOperationException e) {
      e.printStackTrace();
      return Optional.empty();
    }
  }
}