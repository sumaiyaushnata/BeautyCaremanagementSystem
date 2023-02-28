/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beautysalonmanagementsystme.DAO;

import com.beautysalonmanagementsystme.common.ICommonDAO;
import com.beautysalonmanagementsystme.model.EmployeeDetails;
import com.beautysalonmanagementsystme.model.Service;
import com.beautysalonmanagementsystme.util.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author sumaiyaushnata
 */
public class ServiceDAO implements ICommonDAO<Service> {

    @Override
    public int add(Service s) {
        int status=0;
        String sql="Insert INTO service(service_code,service_name,service_catagory,service_productDetails,service_duration,service_Price) values(?,?,?,?,?,?)";
     Connection con=DataBaseConnection.getConnetion();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, s.getServiceCode());
            ps.setString(2, s.getServiceCatagory());
            ps.setString(3, s.getServiceName());
            ps.setString(4, s.getServiceProductDetails());
            ps.setInt(5, s.getServiceDuration());
            ps.setInt(6, s.getServicePrice());
            
            
           
            status=ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
   return status;
    }

}
