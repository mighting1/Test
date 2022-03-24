package com.data;

import java.util.Scanner;

/*
贪心算法
 */
public class splitChange {
    public static void main(String[] args) {
        System.out.print("输入需要找零的钱币：");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        split(money);

    }
    public static void split(int money){
        int[] prices={100,50,20,10,5,1};
        int[] notes=new int[prices.length];
        int change=money;
        if (money>0){
            while (change>0){
                for (int i=0;i<prices.length;i++){
                    int count=0;
                    for (int k=0;change-prices[i]>=0;k++){

                            change=change-prices[i];
                            count++;

                    }
                    notes[i]=count;
                }

            }
        }
        System.out.println("找零：");
        for (int i=0;i<prices.length;i++){
            System.out.print(notes[i]+"张"+prices[i]+"元"+",");
        }

    }
}
