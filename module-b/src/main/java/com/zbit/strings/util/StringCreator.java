package com.zbit.strings.util;

import java.util.Random;

public class StringCreator {
    public String generateRandomString() {
        return Double.toString(new Random().nextDouble());
    }
}
