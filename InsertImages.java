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
import javax.swing.*;

public class InsertImages 
{
    
    public static void main(String[] args)
    {
        try
        {
         
            System.out.println("This is inserting a image in database code.");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","root");
            
            String q = "insert into images(pic) values(?)";
            
            PreparedStatement pstmt =  con.prepareStatement(q);
  
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            
            pstmt.setBinaryStream(1, fis,fis.available());
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "success");
            
            System.out.println("Image insert is done.....");        
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
        }
    }
    
}
