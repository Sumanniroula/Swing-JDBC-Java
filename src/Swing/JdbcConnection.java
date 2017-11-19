/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Suman
 */
public class JdbcConnection extends Student{
    
    Connection connection = null;
    String username;
    String password;
    String url;

    public JdbcConnection() {
    
        try{
        username = "root";
        password = "";
        url = "Jdbc:mysql://Localhost:3306/bhai";
        connection = DriverManager.getConnection(url, username, password);
            Statement myStmt = connection.createStatement();
            String sql = "insert into student"
                         +"(firstname,lastname)"
                         +"values(firstname1,lastname1)";
          
            myStmt.execute(sql);
                
            JOptionPane.showMessageDialog(null, "Insertion Successful");
        
        }
        catch(SQLException sq){
            JOptionPane.showMessageDialog(null, "Database connection failed !"+sq);
        }
    }
}    

