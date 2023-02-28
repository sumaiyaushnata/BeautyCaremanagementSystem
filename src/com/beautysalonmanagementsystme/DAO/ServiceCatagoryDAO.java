/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beautysalonmanagementsystme.DAO;

import com.beautysalonmanagementsystme.common.ICommonDAO;
import com.beautysalonmanagementsystme.model.ServiceCategory;
import com.beautysalonmanagementsystme.util.DataBaseConnection;
import java.sql.*;

/**
 *
 * @author sumaiyaushnata
 */
public class ServiceCatagoryDAO implements ICommonDAO<ServiceCategory> {

   

   

    @Override
    public int add(ServiceCategory sc) {
     int status=0;
     String sql="Insert INTO catagory(catagory_type ,catagory_code) values(?,?)";
     Connection con=DataBaseConnection.getConnetion();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, sc.getServiceCatagoryCode());
            ps.setString(2, sc.getServiceCatagorytype());
            status=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
            
     
     
     
    return status;}

}
