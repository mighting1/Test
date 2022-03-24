package com.test;

import java.util.Scanner;

/*
打印矩形
 */
public class test10 {
    public static void main(String[] args) {
        System.out.println("输入矩形的长和宽：");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();
        for (int i=0;i<l;i++){
            for (int j=0;j<h;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
