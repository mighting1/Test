package com.data;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        System.out.println("输入数塔层数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("输入数塔：");
        while (sc.hasNext()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    a[i][j] = Integer.parseInt(sc.next());

                }
            }
            //System.out.println(a[1][1]);
            int[][] f=new int[n][n];
            f[0][0]=a[0][0];
            int i,j;
            for (i=1;i<n;i++){
                for (j=0;j<=i;j++){
                    if (j==0){
                        f[i][j]=f[i-1][j]+a[i][j];
                    }else if (j==i){
                        f[i][j]=f[i-1][j-1]+a[i][j];
                    }else {
                        int max=f[i-1][j]>f[i-1][j-1] ? f[i-1][j]:f[i-1][j-1];
                        f[i][j]=max+a[i][j];
                    }
                }
            }
            int temp=0;
            for(i=0;i<n;i++){
                if (f[n-1][i]>temp){
                    temp=f[n-1][i];
                }
            }
            System.out.println(temp);
            return;
        }

    }

}
