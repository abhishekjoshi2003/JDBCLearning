/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbclearning;

/**
 *
 * @author RCAT
 */

import java.sql.*;

public class InsertJDBC 
{
    
    public static void main(String[] args)
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","root");
            //CREATE A QUERY
            String q = "CREATE TABLE TABLE1(TID INT (20) PRIMARY KEY AUTO_INCREMENT,TNAME VARCHAR(200) NOT NULL , TCITY VARCHAR(400))";
            
            //CREATE A STATEMENT:
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(q);
            
            System.out.println("Table created in database...");
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
