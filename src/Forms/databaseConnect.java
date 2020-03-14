/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;
 import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Shahryar Khan
 */
public class databaseConnect {
    
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
       static final String DB_URL = "jdbc:mysql://localhost:3306/christ_church_db";
       static final String USER = "root";
       static final String PASS = "mysqldb";

   /*    public static void main(String[] args) {

            Connection conn = null;

            try{
            // Class.forName("com.mysql.jdbc.Driver");
            // System.out.println("Connecting to a selected database...");
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
       
     
        }catch(SQLException se){
          //Handle errors for JDBC

       }catch(Exception e){
          //Handle errors for Class.forName

       }
     }
       */
       public boolean isConnected()
       {
           boolean isconnect = false;
            Connection conn = null;
            try{
              //  Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
            if( conn==null){
                 
                isconnect = false;
                 
             }
            else{
                isconnect = true;
            }
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
            return isconnect;
           
       }
        public Connection dbConnect()
       {
           boolean isconnect = false;
            Connection conn = null;
            try{
             // Class.forName(JDBC_DRIVER);
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
           
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
            return conn;
           
       }
        
        
   public static java.sql.Timestamp convertToSQLDate(java.util.Date date) {
    java.sql.Timestamp sqlDate = null;
    if (date != null) {
        sqlDate = new java.sql.Timestamp(date.getTime());
    }
    return sqlDate;
}
   
      public static java.sql.Date convertSQLDate(java.util.Date date) {
    java.sql.Date sqlDate = null;
    if (date != null) {
        sqlDate = new java.sql.Date(date.getTime());
    }
    return sqlDate;
}
    
}
