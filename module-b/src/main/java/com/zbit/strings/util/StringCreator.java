package com.zbit.strings.util;

import java.util.Random;
import org.apache.commons.lang3.tuple.Pair;

public class StringCreator {

  public String generateRandomString() {
    return Double.toString(new Random().nextDouble());
  }

  public Pair<String, String> createPair(String left, String right) {
    return Pair.of(left, right);
  }
}
