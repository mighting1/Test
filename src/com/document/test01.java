package com.document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
文件写入
 */
public class test01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter out=new BufferedWriter(new FileWriter("round.txt"));
        out.write("Java");
        out.write("PHP");
        out.close();
        System.out.println("文件创建成功！");
    }
}
