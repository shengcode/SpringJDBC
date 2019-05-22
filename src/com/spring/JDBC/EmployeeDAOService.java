/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.JDBC;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOService implements EmployeeDAO {
    private DataSource dataSource;
    private JdbcTemplate jTemplate;
    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource=ds;
        jTemplate=new JdbcTemplate(ds);
    }

    @Override
    public void addEmployee(Employee e) {
        // prepared statement 
        String SQLquery= "Insert into employee_1 values(?,?,?)";
        jTemplate.update(SQLquery,e.getEmpId(),e.getEmpName(),e.getSalary());
    }
    @Override
    public Employee searchEmployeeById(Integer id) {
        Employee e;   
        String fetchQuery= "Select * from employee_1 where eid=?";   
        e = jTemplate.queryForObject(fetchQuery, new Object[]{id}, new EmployeeRowMapper());        
        return e;
    }

    @Override
    public void deleteEmployee(Integer i) {
        String deleteQuery="delete from employee_1 where eid="+i;
        jTemplate.execute(deleteQuery);
    }

    @Override
    public void updateEmployee(Integer i, String name) {
        String updateQuery="update employee_1 set ename= "+"\'"+ name +"\'"+ " where eid="+ i;
        jTemplate.execute(updateQuery);
    }
    
}
