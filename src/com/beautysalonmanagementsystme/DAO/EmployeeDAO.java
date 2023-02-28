/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beautysalonmanagementsystme.DAO;

import com.beautysalonmanagementsystme.common.ICommonDAO;
import com.beautysalonmanagementsystme.model.CustomerDetails;
import com.beautysalonmanagementsystme.model.EmployeeDetails;
import com.beautysalonmanagementsystme.util.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author sumaiyaushnata
 */
public class EmployeeDAO implements ICommonDAO<EmployeeDetails> {

    @Override
    public int add(EmployeeDetails emp) {
        int status=0;
        String sql="Insert INTO employee(emp_code,emp_name,emp_contactnumber,emp_email,emp_address,emp_district,emp_specialized,emp_user,emp_pasword) values(?,?,?,?,?,?,?,?,?)";
     Connection con=DataBaseConnection.getConnetion();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, emp.getEmpCode());
            ps.setString(2, emp.getEmpName());
            ps.setString(3, emp.getEmpContactNumber());
            ps.setString(4, emp.getEmpEmail());
            ps.setString(5, emp.getEmpaddress());
            ps.setString(6, emp.getEmpDistrict());
            ps.setString(7, emp.getEmpSalary());
            ps.setString(8, emp.getEmpUser());
            ps.setString(9, emp.getEmpPassword());
           
            
           
            status=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
   return status; }

}
