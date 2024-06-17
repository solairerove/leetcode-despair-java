package com.github.solairerove.sort;

import com.github.solairerove.common.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class QuickSortTest {

    private final QuickSort quickSort = new QuickSort();

    @Test
    public void quickSortTest() {
        var pairs = List.of(new Pair(3, "cat"), new Pair(2, "dog"), new Pair(3, "bird"));
        var actual = quickSort.quickSort(pairs);

        var expected = List.of(new Pair(2, "dog"), new Pair(3, "bird"), new Pair(3, "cat"));

        Assertions.assertEquals(expected, actual);
    }
}
