package com.data;


public class binarySearch {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7};
        int key = 5;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (key == nums[mid]) {
                System.out.println(mid);
                return;
            } else if (key > nums[mid]) {
                left = mid + 1;
            } else if (key < nums[mid]) {
                right = mid - 1;
            }
        }
    }
}

