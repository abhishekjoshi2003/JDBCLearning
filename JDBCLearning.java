/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbclearning;

import java.sql.*;

/**
 *
 * @author RCAT
 */
public class JDBCLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        String url = "jdbc:mysql://localhost:3306/test2";
        String username = "root";
        String password  = "root";
            
        Connection con = DriverManager.getConnection(url,username,password);
        if(con.isClosed())
            System.out.println("Connection is closed");
        
        else
            System.out.println("Connection created.........");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
