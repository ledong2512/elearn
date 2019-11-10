/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacon;
import java.sql.*;
/**
 *
 * @author 123
 */
public class addData {
   static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
   static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=elearn";

   //  Database credentials
   static final String USER = "admin";
   static final String PASS = "admin";
   public String addSQL(String tu,String phienam, String nghia, String hashtag,String loaitu,String anh){
       String check="ok";
       Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Adding data...");
      stmt = conn.createStatement();
      
       String sql = "INSERT INTO data " +
                   "VALUES ("+"'"+tu+"'"+","+"'"+phienam+"'"+","+"N"+"'"+nghia+"'"+","+"'"+hashtag+"'"+","+"'"+loaitu+"'"+","+"'"+anh+"'"+",getdate()"+")";
      stmt.executeUpdate(sql);
      System.out.println("success...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
      check="notok";
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
       check="notok";
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
       return check;
   }
}
