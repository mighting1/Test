package com.test;

import java.util.Scanner;

/*
打印倒立三角形
 */
public class test08 {
    public static void main(String[] args) {
        System.out.println("输入打印倒立三角行的行数：");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i=n;i>0;i--){
            for (int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
            for (int j=n+1;j>i;j--){
                System.out.print(" ");
            }

        }
    }
}
