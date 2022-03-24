package com.data;

import java.util.LinkedList;

public class test03 {
    public static void main(String[] args) {
        LinkedList <String> lList=new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        System.out.println(lList);
        lList.addFirst("0");
        lList.addLast("3");
        System.out.println(lList);
        lList.remove("1");
        System.out.println(lList);
        lList.addFirst("5");
        System.out.println(lList);
        lList.remove("0");
        System.out.println(lList);
    }

}
