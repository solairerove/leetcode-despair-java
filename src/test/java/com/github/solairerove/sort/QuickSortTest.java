package com.github.solairerove.sort;

import com.github.solairerove.common.Pair;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QuickSortTest {

    private final QuickSort quickSorter = new QuickSort();

    @Test
    public void quickSortTest() {
        var pairs = Arrays.asList(
                new Pair(3, "cat"),
                new Pair(2, "dog"),
                new Pair(3, "bird")
        );
        var actual = quickSorter.quickSort(pairs);

        assertEquals(2, actual.get(0).getKey());
        assertEquals(3, actual.get(1).getKey());
        assertEquals(3, actual.get(2).getKey());
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
        var actual = quickSorter.quickSort(pairs);

        assertEquals(1, actual.get(0).getKey());
        assertEquals(5, actual.get(1).getKey());
        assertEquals(9, actual.get(2).getKey());
        assertEquals(9, actual.get(3).getKey());
        assertEquals(9, actual.get(4).getKey());
    }

    @Test
    public void testBasicSort() {
        List<Pair> pairs = Arrays.asList(new Pair(3, "C"), new Pair(1, "A"), new Pair(2, "B"));
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Arrays.asList(new Pair(1, "A"), new Pair(2, "B"), new Pair(3, "C")), sortedPairs);
    }

    @Test
    public void testDuplicateKeys() {
        List<Pair> pairs = Arrays.asList(new Pair(3, "C"), new Pair(1, "A"), new Pair(3, "B"), new Pair(2, "D"));
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Arrays.asList(new Pair(1, "A"), new Pair(2, "D"), new Pair(3, "B"), new Pair(3, "C")), sortedPairs);
    }

    @Test
    public void testNegativeKeys() {
        List<Pair> pairs = Arrays.asList(new Pair(-1, "B"), new Pair(-2, "A"), new Pair(0, "C"));
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Arrays.asList(new Pair(-2, "A"), new Pair(-1, "B"), new Pair(0, "C")), sortedPairs);
    }

    @Test
    public void testEmptyList() {
        List<Pair> pairs = Collections.emptyList();
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Collections.emptyList(), sortedPairs);
    }

    @Test
    public void testSingleElement() {
        List<Pair> pairs = Collections.singletonList(new Pair(1, "A"));
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Collections.singletonList(new Pair(1, "A")), sortedPairs);
    }

    @Test
    public void testNullInput() {
        List<Pair> pairs = null;
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertNull(sortedPairs);
    }

    @Test
    public void testAlreadySortedList() {
        List<Pair> pairs = Arrays.asList(new Pair(1, "A"), new Pair(2, "B"), new Pair(3, "C"));
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Arrays.asList(new Pair(1, "A"), new Pair(2, "B"), new Pair(3, "C")), sortedPairs);
    }

    @Test
    public void testAllSameKeys() {
        List<Pair> pairs = Arrays.asList(new Pair(1, "A"), new Pair(1, "B"), new Pair(1, "C"));
        List<Pair> sortedPairs = quickSorter.quickSort(pairs);
        assertEquals(Arrays.asList(new Pair(1, "A"), new Pair(1, "B"), new Pair(1, "C")), sortedPairs);
    }
}
