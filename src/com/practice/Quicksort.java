package com.practice;
/*
快速排序
 */
public class Quicksort {
    public static void main(String[] args) {
        int[] nums={1,5,12,10,6,16,4,11,18,8,20,9,17};
        int left=0;
        int right=nums.length-1;
        sort(nums,left,right);
        System.out.println("排序后：");
        for (int i : nums){
            System.out.print(nums[i]+",");
        }

    }
    public static int[] sort(int[] nums,int left,int right){
        int l=left;
        int r=right;
        int pivot=(l+r)/2;
        while (l<r){
            while (nums[l]<pivot){
                l++;
            }
            while (nums[r]>pivot){
                r--;
            }
        }
        return nums;
    }
}
