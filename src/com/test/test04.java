package com.test;

import java.util.Scanner;

/*
阶乘
 */
public class test04 {
    public static void main(String[] args) {
        System.out.println("输入数字：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(i+"!="+factorial(i));
        }
    }
    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
