/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;

/**
 *
 * @author Asus
 */
public class ProductDao {
    public static void save(Product product){
        String query ="insert into product (name,category,price)values('"+product.getName()+"','"+product.getCategory()+"','"+product.getPrice()+"')";
        DbOperations.setDataOrDelete(query, "Product Added Sucessfully");
        
    }
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> list = new ArrayList<>();
        try{
        ResultSet rs = DbOperations.getData("Select * from product ");
        while(rs.next()){
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setCategory(rs.getString("category"));
            product.setPrice(rs.getString("price"));
            list.add(product);
            
            
        }
           }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return list;
    }
    public static void update(Product product){
        String query = "update product set name = '"+product.getName()+"',category = '"+product.getCategory()+"',price = '"+product.getPrice()+"' where id = '"+product.getId()+"'";
        DbOperations.setDataOrDelete(query, "Product Updated Sucessfully");
    }
     public static void delete(String id){
        String query = "delete from product  where id = '"+id+"'";
        DbOperations.setDataOrDelete(query, "Product Deleted Sucessfully");
    }
    
}
