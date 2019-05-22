/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springexamples;

import com.SpringWiring.Employee;
import com.SpringWiring.Employee1;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAutowiringMain {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("myMetadata.xml");
 
        //autowire=byType
        Employee employee = (Employee)context.getBean("employee");
        System.out.println("Employee Details : "+employee);
        
        //autowire=constructor
        Employee1 employee1 = (Employee1)context.getBean("employee1");
        System.out.println("Employee1 Details : "+employee1);
    }
}
