package com.data;
/*
快速排序
 */
public class Quicksort {
    public static void main(String[] args) {
        int[] nums={1,5,12,10,6,16,4,11,18,8,20,9,17};
        int left=0;
        int right=nums.length-1;
        sort(nums,left,right);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static int[] sort(int[] nums,int left,int right){
        int l=left;
        int r=right;
        int pivot=nums[(left+right)/2];
        while (l<r){
            while (nums[l]<pivot){
                l++;
            }
            while (nums[r]>pivot){
                r--;
            }
            if (l>=r){
                break;
            }
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
        }
        if (l==r){
            l++;
            r--;
        }
        if (left<r){
            sort(nums,left,r);
        }
        if (right>l){
            sort(nums,l,right);
        }

        return nums;

    }
}
