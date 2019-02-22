package com.zbit.modules.base;

import com.zbit.strings.util.StringCreator;

public class Main {

  public static void main(String[] args) {
    System.out.format("Hello World: " + new StringCreator().generateRandomString() + "\n");
  }
}