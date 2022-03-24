package com.document;

import java.io.File;

/*
删除文件
 */
public class test03 {
    public static void main(String[] args) {
        try {
            File file=new File("/Users/zhangjiuwei/Desktop/gssys.sql");
            if (file.delete()){
                System.out.println(file.getName()+"文件删除成功！");
            }else {
                System.out.println("文件删除失败！");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
