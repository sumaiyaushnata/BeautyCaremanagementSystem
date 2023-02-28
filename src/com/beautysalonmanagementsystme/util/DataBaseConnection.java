/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beautysalonmanagementsystme.util;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sumaiyaushnata
 */
public class DataBaseConnection {
    public static Connection getConnetion(){
        Connection con=null;
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/beautycare", "root", "root");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    return con;}

}
