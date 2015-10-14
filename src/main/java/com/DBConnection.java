package com;

import java.sql.*;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class DBConnection {


    public static Connection getConnection() {

        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");

        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldb", "root", "programmer88");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
//        PreparedStatement st = null;
//        try {
//            st = connection.prepareStatement("SELECT * FROM mysqldb.products where ID = ?;");
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                int key = rs.getInt(1);
//                String name = rs.getString("NAME");
//                System.out.println(key + " " + name);
//            }
//                if (!rs.next()) {
//                    System.out.println("Error getting key");
//                }
//            }catch(SQLException e){
//                e.printStackTrace();
//            }

//        return null;


    }
}


