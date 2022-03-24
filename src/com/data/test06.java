package com.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/*
HashMap遍历
 */
public class test06 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("1","1st");
        hashMap.put("2","2nd");
        hashMap.put("3","3rd");
        Collection cl =hashMap.values();
        Iterator iterator=cl.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
