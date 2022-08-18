/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
//import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ConnectionProviderClass {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","0000");
            return con;
        }
        catch(Exception e){
            return null;
            
        }
    }
    
}
