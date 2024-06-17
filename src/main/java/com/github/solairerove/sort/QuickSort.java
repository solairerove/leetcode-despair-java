package com.github.solairerove.sort;

import com.github.solairerove.common.Pair;

import java.util.Collections;
import java.util.List;

public class QuickSort {
    public List<Pair> quickSort(List<Pair> pairs) {
        if (pairs == null || pairs.isEmpty()) {
            return pairs;
        }

        quickSortHelper(pairs, 0, pairs.size() - 1);

        return pairs;
    }

    private void quickSortHelper(List<Pair> pairs, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(pairs, left, right);
            quickSortHelper(pairs, left, pivotIndex - 1);
            quickSortHelper(pairs, pivotIndex + 1, right);
        }
    }

    private int partition(List<Pair> pairs, int left, int right) {
        Pair pivot = pairs.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (pairs.get(j).getKey() <= pivot.getKey()) {
                i++;
                Collections.swap(pairs, i, j);
            }
        }

        Collections.swap(pairs, i + 1, right);

        return i + 1;
    }
}