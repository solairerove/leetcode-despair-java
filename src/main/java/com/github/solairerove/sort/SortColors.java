package com.github.solairerove.sort;

// O(1) space / O(n) time
public class SortColors {

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            switch (nums[i]) {
                case 0 -> {
                    swap(nums, i, left);
                    i++;
                    left++;
                }
                case 1 -> i++;
                case 2 -> {
                    swap(nums, i, right);
                    right--;
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
