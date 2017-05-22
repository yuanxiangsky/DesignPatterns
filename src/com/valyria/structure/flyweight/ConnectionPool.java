package com.valyria.structure.flyweight;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class ConnectionPool {
    private ArrayList<Connection> pool;

    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;
    private static ConnectionPool instace = null;
    Connection conn = null;

    private ConnectionPool(){
        pool = new ArrayList<Connection>(poolSize);
        for(int i=0;i<poolSize;i++){
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void release(){
        pool.add(conn);
    }

    public synchronized Connection getConn(){
        if(pool.size()>0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else
            return null;
    }

}
