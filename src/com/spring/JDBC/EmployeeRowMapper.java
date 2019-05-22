/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeRowMapper implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee emp1=new Employee();
        Integer id=rs.getInt(1);
        emp1.setEmpId(id.toString());
        emp1.setEmpName(rs.getString(2));
        emp1.setSalary(rs.getDouble(3));
        return emp1;
    }
    
}
