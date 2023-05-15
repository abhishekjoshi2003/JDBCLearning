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

public class SelectJDBC {
    
    public static void main(String[] args) {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","root");
            
            String q = "Select * from table1";
            
            Statement stmt  = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(q);
            
            while(rs.next())
            {
                int id  = rs.getInt(1);
                String name = rs.getString(2);
                String city = rs.getString(3);
                
                System.out.println(id+"   "+name+"\t"+city);
            }
            
            conn.close();
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }
}
