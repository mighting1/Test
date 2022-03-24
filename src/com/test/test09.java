package com.test;

import java.util.Scanner;

/*
打印平行四边形
 */
public class test09 {
    public static void main(String[] args) {
        System.out.println("输入打印平行四边形的行数：");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for (int i =0;i<n;i++){
            for (int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
