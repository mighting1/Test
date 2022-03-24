package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
获取本机ip地址及主机名
 */
public class GetHost {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress adr=InetAddress.getLocalHost();
        //System.out.println(adr);
        System.out.println("ip:"+adr.getHostAddress());
        System.out.println("主机名："+adr.getHostName());
    }
}
