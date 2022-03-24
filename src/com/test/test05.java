package com.test;
/*
打印菱形
 */
import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        System.out.println("输入打印菱形的行数：");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0){
            n++;
        }
        for (int i=0;i<n/2+1;i++){
            for (int j=n/2+1;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<n/2+1;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=2*i+1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
