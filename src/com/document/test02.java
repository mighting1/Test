package com.document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
读取文件内容
 */
public class test02 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("round.txt"));
            String str;
            while ((str=in.readLine())!=null){
                System.out.println(str);
            }
        }catch (IOException e){

        }


    }
}
