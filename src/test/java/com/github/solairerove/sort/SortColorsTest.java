package com.github.solairerove.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortColorsTest {

    private final SortColors sortColors = new SortColors();

    @Test
    public void sortColorsTest() {
        var arr = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColors(arr);

        var expected = new int[]{0, 0, 1, 1, 2, 2};
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], arr[i]);
        }
    }

    @Test
    public void sortColorsTest1() {
        var arr = new int[]{2, 0, 1};
        sortColors.sortColors(arr);

        var expected = new int[]{0, 1, 2};
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], arr[i]);
        }
    }
}
