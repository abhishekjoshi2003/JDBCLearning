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
import java.util.Scanner;

public class PreparedStatementDemo 
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc  = new Scanner(System.in);
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","root");
            
            //create a query
            String query = "INSERT INTO TABLE1(TNAME , TCITY) VALUES(?,?)";
            
            //GET THE PREPAREDSTATEMENT OBJECT
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            //set the value to query
            for(int i=0 ;i<3 ;i++)
            {
                System.out.println("Enter name and city");
                String name  = sc.nextLine();
                
                 pstmt.setString(1,name);
                 String city = sc.nextLine();
                 pstmt.setString(2, city);
                    pstmt.executeUpdate();
            }
         
            
            System.out.println("Inserted .....");
            
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
