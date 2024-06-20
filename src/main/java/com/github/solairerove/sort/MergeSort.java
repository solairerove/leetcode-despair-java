package com.github.solairerove.sort;

import com.github.solairerove.common.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// O(nlog(n)) space / O(nlog(n)) time
public class MergeSort {

    public List<Pair> mergeSort(List<Pair> pairs) {
        if (pairs.size() < 2) {
            return pairs;
        }

        int mid = pairs.size() / 2;
        List<Pair> left = mergeSort(pairs.subList(0, mid));
        List<Pair> right = mergeSort(pairs.subList(mid, pairs.size()));

        return merge(left, right);
    }

    private List<Pair> merge(List<Pair> left, List<Pair> right) {
        List<Pair> merged = new ArrayList<>();
        int low = 0;
        int high = 0;
        while (low < left.size() && high < right.size()) {
            if (left.get(low).getKey() <= right.get(high).getKey()) {
                merged.add(left.get(low));
                low++;
            } else {
                merged.add(right.get(high));
                high++;
            }
        }

        merged.addAll(left.subList(low, left.size()));
        merged.addAll(right.subList(high, right.size()));

        return merged;
    }

    // 912. Sort an Array
    public int[] mergeSort(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int mid = nums.length / 2;
        var left = mergeSort(Arrays.stream(nums, 0, mid).toArray());
        var right = mergeSort(Arrays.stream(nums, mid, nums.length).toArray());

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int low = 0;
        int high = 0;
        int i = 0;
        while (low < left.length && high < right.length) {
            if (left[low] <= right[high]) {
                merged[i] = left[low];
                low++;
                i++;
            } else {
                merged[i] = right[high];
                high++;
                i++;
            }
        }

        while (low < left.length) {
            merged[i] = left[low];
            low++;
            i++;
        }

        while (high < right.length) {
            merged[i] = right[high];
            high++;
            i++;
        }

        return merged;
    }
}
