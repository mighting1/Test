package com.test;
import java.util.Scanner;
/*
斐波那契数列
 */
public class test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入number");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
        System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int number){
        if (number==0||number==1){
            return number;
        }else {
            return fibonacci(number-1)+fibonacci(number-2);
        }
    }
}
