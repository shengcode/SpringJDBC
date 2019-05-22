/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManageEmployeeDao {
    public static void main (String[] args){
         ApplicationContext ctx = new ClassPathXmlApplicationContext("myOracleBeans.xml");
         EmployeeDAO dao = (EmployeeDAO) ctx.getBean("empService1" );
         
         Employee e1=(Employee)ctx.getBean("emp1");
         System.out.println(e1);
         dao.addEmployee(e1);
         Employee e2= dao.searchEmployeeById(112);
         System.out.println(e2);
         
        //dao.deleteEmployee(112);
        dao.updateEmployee(112, "newName");
         
    }
}
