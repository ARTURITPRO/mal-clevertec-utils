package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void PositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("22"));
    }

    @Test
    void NegativeNumberTest() {
        assertFalse(StringUtils.isPositiveNumber("-67"));
    }

    @Test
    void NullNumberTest() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }
}