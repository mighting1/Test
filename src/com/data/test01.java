package com.data;

import java.util.Scanner;

/*
数字求和运算
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println("数字求和，输入N");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i=0;
//        for (int i=0;i<=n;i++){
//            count+=i;
//        }
        do {
            count+=i;
            i++;
        }while (i<=n);
        System.out.println(count);
    }
}
