package com.test;

import java.sql.*;

/*
java MySQL连接
 */
public class MySQLDemo {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/BFXT";
    static final String USER="root";
    static final String PASS="root";
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("连接数据库。。。");
            conn= DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("实例化Statement对象。。。");
            stmt=conn.createStatement();
            String sql;
            sql="select LXDM,TZM from BF_SSSJ";
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                String lxdm=rs.getString("LXDM");
                String tzm=rs.getString("TZM");
                System.out.println("lxdm:"+lxdm);
                System.out.println("tzm:"+tzm);
            }
            rs.close();
            stmt.close();
            conn.close();

        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
