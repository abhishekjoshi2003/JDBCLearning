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
import java.io.*;

public class UpdatePreparedStatement 
{
    public static void main(String[] args) 
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","root");
            
            String q = "UPDATE TABLE1 SET TNAME = ? , TCITY = ? WHERE TID = ?";
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter new name : ");
            
            String name = br.readLine();
            
            System.out.println("Enter new city name : ");
            String city = br.readLine();
            
            System.out.println("Enter student id : ");
            int id = Integer.parseInt(br.readLine());
            
            PreparedStatement pstmt = conn.prepareStatement(q);
            
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3,id);
            
            pstmt.executeUpdate();
            
            System.out.println("Done........");
            
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
