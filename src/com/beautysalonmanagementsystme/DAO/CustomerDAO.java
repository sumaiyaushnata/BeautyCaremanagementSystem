/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beautysalonmanagementsystme.DAO;

import com.beautysalonmanagementsystme.common.ICommonDAO;
import com.beautysalonmanagementsystme.model.CustomerDetails;
import com.beautysalonmanagementsystme.model.ServiceCategory;
import com.beautysalonmanagementsystme.util.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class CustomerDAO implements ICommonDAO<CustomerDetails> {

    @Override
    public int add(CustomerDetails cus) {
        
        int status=0;
     String sql="Insert INTO customer(customer_code,customer_firstname,customer_lastname,customer_firstIn,customer_email,customer_address,customer_contactnumber,customer_notes,customer_district) values(?,?,?,?,?,?,?,?,?)";
     Connection con=DataBaseConnection.getConnetion();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, cus.getCusCode());
            ps.setString(2, cus.getCusfirstName());
            ps.setString(3, cus.getCuslastName());
            ps.setString(4, cus.getCusfirstIn());
            ps.setString(5, cus.getCusemail());
            ps.setString(6, cus.getCusaddress());
            ps.setString(7, cus.getCusnotes());
            ps.setString(8, cus.getCuscontactNumber());
            ps.setString(9, cus.getCusdistrict());
            
           
            status=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    return status;}
    
}
