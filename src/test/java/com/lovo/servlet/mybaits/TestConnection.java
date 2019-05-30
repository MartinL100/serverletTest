package com.lovo.servlet.mybaits;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

    @Test
    public void connection(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/db01?characterEncoding=utf-8","root","123456");
            System.out.println(con.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
