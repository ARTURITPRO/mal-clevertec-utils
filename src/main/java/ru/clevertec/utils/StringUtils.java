package ru.clevertec.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.createDouble(str) > 0;
    }
}
