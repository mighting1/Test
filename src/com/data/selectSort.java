package com.data;
/*
选择简单排序
 */
public class selectSort {
    public static void main(String[] args) {
        int[] nums={5,3,1,2,4};
        sort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static int[] sort(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            int min =nums[i];
            int minIndex=i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<min){
                    min=nums[j];
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                nums[minIndex]=nums[i];
                nums[i]=min;

            }
        }
        return nums;
    }
}
