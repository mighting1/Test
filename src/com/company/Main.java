package com.company;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://www.runoob.com/html/html-tutorial.html");
        System.out.println(url.toString());
        System.out.println(url.openConnection());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getHost());
        System.out.println(url.getProtocol());
        System.out.println(url.getPort());
        System.out.println("*************************************");
        URLConnection conn = url.openConnection();

        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();

        for( String key : keys ){
            String val = conn.getHeaderField(key);
            System.out.println(key+"    "+val);
        }
        System.out.println( conn.getLastModified() );
    }
}