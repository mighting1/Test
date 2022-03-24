package com.data;

import java.util.Scanner;

public class positives {
    public static void main(String[] args) {
        System.out.println("输入台阶级数：");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
    }
    public static int f(int n){
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
