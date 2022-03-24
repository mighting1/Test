package com.document;

import java.io.*;

/*
创建临时文件
 */
public class test05 {
    public static void main(String[] args) throws IOException {
        File temp=File.createTempFile("test","txt");
        System.out.println("文件路径："+temp.getPath());
        temp.deleteOnExit();
        BufferedWriter out =new BufferedWriter(new FileWriter("temp"));
        out.write("aString");
        System.out.println("临时文件已创建！");
        out.close();
    }
}
