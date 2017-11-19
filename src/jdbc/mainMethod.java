/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import Swing.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Suman
 */
public class mainMethod extends Student{
    public static void main(String[] args) {
    Connection connection = null;
    String username;
    String password;
    String url;
    String fuck = "fuckked";
    
    
        try{
        username = "root";
        password = "";
        url = "Jdbc:mysql://Localhost:3306/bhai";
        connection = DriverManager.getConnection(url, username, password);
            Statement myStmt = connection.createStatement();
            String sql = "insert into student"
                         +"(firstname,lastname)"
                    +"values(firstname1,lastname)";
          
            myStmt.execute(sql);
                System.out.println("Insertion Complete");
        
        }
        catch(SQLException sq){
            JOptionPane.showMessageDialog(null, "Database connection failed !"+sq);
        }
    }
       
    }

