package com.document;

import java.io.File;
import java.io.IOException;

/*
在指定目录中创建文件
 */
public class test07 {
    public static void main(String[] args) throws IOException {
        File file=null;
        File dir=new File("/Users/zhangjiuwei/Desktop/Test/src/com/");
        file = File.createTempFile
                ("JavaTemp", ".javatemp", dir);
        if (file.exists()){
            System.out.println(file.getPath());
        }else{
            System.out.println("文件不存在！");
        }



    }
}
