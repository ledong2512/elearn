/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacon;

/**
 *
 * @author 123
 */
import java.sql.*;

import java.sql.*;

public class createTable {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
   static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=elearn";

   //  Database credentials
   static final String USER = "admin";
   static final String PASS = "admin";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating table...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE data " +
                   "(tu Nvarchar(30) not NULL, " +
                   " phienam nVARCHAR(30), " + 
                   " nghia nVARCHAR(255), " + 
                   " hashtag nvarchar(30), " +
                   " loaitu varchar(7), " +
                    "anh nvarchar(50), " +
              "ngay DATETIME, " +
                   " PRIMARY KEY ( tu,loaitu ))"; ;
      stmt.executeUpdate(sql);
      System.out.println("Table created successfully...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample