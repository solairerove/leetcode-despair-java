package com.github.solairerove;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        final Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }
}
