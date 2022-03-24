package com.data;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] nums={8,9,17,2,35,4,6,0};
        sort(nums);
        System.out.print(Arrays.toString(nums));

    }
    public static int[] sort(int[] arr){
        for(int gap=arr.length/2;gap>0;gap/=2){	//步长gap逐次递减
            for(int i=gap;i<arr.length;i++){
                for(int j=i-gap;j>=0;j-=gap){
                    if(arr[j]>arr[j+gap]){
                        int t=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=t;
                    }
                }
            }
        }
        return arr;
    }
}
