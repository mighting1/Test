package com.data;


public class twoSum {
    private int[] nums;
    private int target;
    public static void main(String[] args) {
        int[] nums={2,3,6,7,11,15};
        int target=9;
        twoSum tw=new twoSum(nums,target);
        tw.twoSum1(nums,target);

    }
    public twoSum(int[] num,int t){
        nums=num;
        target=t;
    }
    int[] twoSum1(int[] nums, int target){
        int len = nums.length;
        int left = 0, right = len-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                System.out.println("["+(left+1)+","+(right+1)+"]");
                return new int[]{left+1,right+1};
            }else if(nums[left]+nums[right]<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("[-1,-1]");
        return new int[]{-1, -1};
    }
}

