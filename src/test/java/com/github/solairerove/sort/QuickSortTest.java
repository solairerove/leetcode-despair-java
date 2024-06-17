package com.github.solairerove.sort;

import com.github.solairerove.common.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest {

    private final QuickSort quickSort = new QuickSort();

    @Test
    public void quickSortTest() {
        var pairs = Arrays.asList(
                new Pair(3, "cat"),
                new Pair(2, "dog"),
                new Pair(3, "bird")
        );
        var actual = quickSort.quickSort(pairs);

        Assertions.assertEquals(2, actual.get(0).getKey());
        Assertions.assertEquals(3, actual.get(1).getKey());
        Assertions.assertEquals(3, actual.get(2).getKey());
    }

    @Test
    public void quickSortTest_1() {
        var pairs = Arrays.asList(
                new Pair(5, "apple"),
                new Pair(9, "banana"),
                new Pair(9, "cherry"),
                new Pair(1, "date"),
                new Pair(9, "elderberry")
        );
        var actual = quickSort.quickSort(pairs);

        Assertions.assertEquals(1, actual.get(0).getKey());
        Assertions.assertEquals(5, actual.get(1).getKey());
        Assertions.assertEquals(9, actual.get(2).getKey());
        Assertions.assertEquals(9, actual.get(3).getKey());
        Assertions.assertEquals(9, actual.get(4).getKey());
    }
}
