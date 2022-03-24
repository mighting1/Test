package com.data;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums={17,3,25,14,20,9};
        sort(nums);
        System.out.print(Arrays.toString(nums));

    }
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];//待插入左边有序表的数
            int left_index = i - 1;//左边有序表的索引,初值为有序表最右数的索引
            while (left_index >= 0 && insertVal < arr[left_index]) {//不断遍历左边的有序表进行比较
                arr[left_index + 1] = arr[left_index];//比较过的值右移
                left_index--;//索引-1,继续比较
            }
            if (left_index + 1 != i)
                arr[left_index + 1] = insertVal;
        }
        return arr;
    }
}
