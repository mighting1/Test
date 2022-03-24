package com.test;
/*
汉诺塔算法
 */

public class test02 {
    public static void main(String[] args) {
        System.out.println("汉诺塔移动步骤：");
        hanoi(3,'A','B','C');

    }
    public static void hanoi(int n,char A,char B,char C){
        if (n==1){
            move(A, C);
        }else {
            hanoi(n-1,A,C,B);
            move(A, C);
            hanoi(n-1,B,A,C);
        }
    }
    public static void move(char A,char C){
        System.out.println("move:"+A+"-->"+C);
    }
}
