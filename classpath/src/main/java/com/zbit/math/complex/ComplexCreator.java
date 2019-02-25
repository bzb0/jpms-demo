package com.zbit.math.complex;

import org.apache.commons.math3.complex.Complex;

public class ComplexCreator {

  public Complex createComplexNumber(double real) {
    return new Complex(real);
  }
}