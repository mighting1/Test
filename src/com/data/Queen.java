package com.data;

/*
八皇后问题
 */
public class Queen {
    static int[][] datas = new int[8][8];
    static int result = 0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                datas[i][j] = 0;//初始化二维数组，二维数组上的0代表可以放置皇后，1到8代表不可以放置，9代表放置了一个皇后
            }
        }

        tryNext(0);
        System.out.println("总共的方案数目是"+result);
    }

    public static void tryNext(int n){
        for(int i=0;i<8;i++){
            if(datas[n][i] == 0){
                sign(n,i);
                if(n==7){
                    System.out.println("找到了一种方案");
                    result +=1;
                    printItem();
                }else{
                    tryNext(n+1);
                }
                huiSu(n,i);
            }
        }
    }

    public static void sign(int x,int y){
        int tempx = x;
        int tempy = y;
        for(int i=0;i<8;i++){
            if(datas[x][i]==0){
                datas[x][i]=tempx+1;//同行的不可以放置
            }
        }
        for(int i=0;i<8;i++){
            if(datas[i][y]==0){
                datas[i][y]=tempx+1;//同列的不可以放置
            }

        }
        while(x>0&&y>0){//正斜线上半部分不可以放置
            x--;
            y--;
            if(datas[x][y]==0){
                datas[x][y]=tempx+1;
            }
        }
        x=tempx;
        y=tempy;
        while(x<7&&y<7){//正斜线下半部分不可以放置
            x++;
            y++;
            if(datas[x][y]==0){
                datas[x][y]=tempx+1;
            }
        }
        x=tempx;
        y=tempy;
        while(x>0&&y<7){//反斜线上半部分不可以放置
            x--;
            y++;
            if(datas[x][y]==0){
                datas[x][y]=tempx+1;
            }
        }
        x=tempx;
        y=tempy;
        while(x<7&&y>0){//反斜线下半部分不可以放置
            x++;
            y--;
            if(datas[x][y]==0){
                datas[x][y]=tempx+1;
            }
        }

        datas[tempx][tempy]=9;
    }
    public static void huiSu(int x,int y){//回溯，把本行上一次的操作回退
        datas[x][y]=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(datas[i][j] == x+1){
                    datas[i][j]=0;
                }
            }
        }
    }
    public static void printItem(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(datas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

