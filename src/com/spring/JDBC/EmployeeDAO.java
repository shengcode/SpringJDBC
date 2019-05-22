
package com.spring.JDBC;

import javax.sql.DataSource;

public interface EmployeeDAO {
    public void setDataSource(DataSource ds);
    public void addEmployee(Employee e);
    public Employee searchEmployeeById(Integer i);
    public void deleteEmployee(Integer i);
    public void updateEmployee(Integer i, String name);
    
}
