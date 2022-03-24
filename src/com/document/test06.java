package com.document;

import java.io.File;

/*
获取文件大小
 */
public class test06 {
    public static void main(String[] args) {
        File file =new File("temp");
        if (!file.exists()||!file.isFile()){
            System.out.println("文件不存在");

        }else {
            System.out.println("文件大小："+file.length());
        }
    }
}
