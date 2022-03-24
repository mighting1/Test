package com.data;

/*
冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] nums ={3,9,-1,5,8,7,10,20,15};
        sort(nums);

        for (int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static int[] sort(int[] nums){
        boolean flag=false;
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    flag=true;
                }
            }
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }
        return nums;
    }
}
