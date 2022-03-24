package com.document;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
修改文件的最后的修改日期
 */
public class test04 {
    public static void main(String[] args) throws IOException {
        File fileToChange=new File("round.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
