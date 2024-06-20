package com.github.solairerove.sort;

import com.github.solairerove.common.Pair;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    private final MergeSort mergeSorter = new MergeSort();

    @Test
    public void mergeSortTest() {
        var pairs = Arrays.asList(
                new Pair(5, "apple"),
                new Pair(2, "banana"),
                new Pair(9, "cherry"),
                new Pair(1, "date"),
                new Pair(9, "elderberry")
        );
        var actual = mergeSorter.mergeSort(pairs);

        assertEquals(1, actual.get(0).getKey());
        assertEquals(2, actual.get(1).getKey());
        assertEquals(5, actual.get(2).getKey());
        assertEquals(9, actual.get(3).getKey());
        assertEquals(9, actual.get(4).getKey());
    }

    @Test
    public void mergeSortTest1() {
        var pairs = Arrays.asList(
                new Pair(3, "cat"),
                new Pair(2, "dog"),
                new Pair(3, "bird")
        );
        var actual = mergeSorter.mergeSort(pairs);

        assertEquals(2, actual.get(0).getKey());
        assertEquals(3, actual.get(1).getKey());
        assertEquals(3, actual.get(2).getKey());
    }
}
