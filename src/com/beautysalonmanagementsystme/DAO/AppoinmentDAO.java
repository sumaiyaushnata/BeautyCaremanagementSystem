/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beautysalonmanagementsystme.DAO;

import com.beautysalonmanagementsystme.common.ICommonDAO;
import com.beautysalonmanagementsystme.model.Appoinment;
import com.beautysalonmanagementsystme.model.Service;
import com.beautysalonmanagementsystme.util.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author sumaiyaushnata
 */
public class AppoinmentDAO implements ICommonDAO<Appoinment> {

    @Override
    public int add(Appoinment app) {
        int status=0;
        String sql="Insert INTO appoinment(appoinmentCode,catagory,client,employee,package,service,app_date,app_time) values(?,?,?,?,?,?,?,?)";
     Connection con=DataBaseConnection.getConnetion();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,app.getCatagorybox());
            ps.setString(2,app.getAppoinmentCode());
            ps.setString(3,app.getClientBox());
            ps.setString(4,app.getEmpbox());
            ps.setString(5,app.getPackagebox());
            ps.setString(6,app.getServicebox());
            ps.setString(7,app.getAppDate());
            ps.setString(8,app.getAppTime());
            
            
           
            status=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
   return status;}
}
