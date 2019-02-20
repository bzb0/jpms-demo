package com.zbit.modules;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing example for Java 11")
public class ExampleTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleTest.class);

    @BeforeAll
    static void setup() {
        LOGGER.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        LOGGER.info("@BeforeEach - executes before each test method in this class");
    }

    @Test
    void testSingleSuccessTest() {
        assertEquals(1, 1, "Not same number");
    }
}