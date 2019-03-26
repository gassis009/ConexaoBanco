/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class JdbcUtil {
     
    private static Connection conn;
    
     private static String strConn = "jdbc:mysql://127.0.0.1:3306/escola"; 
    public static Connection getConnection() throws Exception {
    
        Class.forName("com.mysql.jdbc.Driver");
        
        
    
       
    if (JdbcUtil.conn != null) 
    {
        return JdbcUtil.conn;
    }
    
    else 
    {
        JdbcUtil.conn = DriverManager.getConnection(strConn,"root","");
        
        return JdbcUtil.conn;
    }
   }
    
    }
    

