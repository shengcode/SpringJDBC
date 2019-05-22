/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.springJDBC;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringJDBCMain {
    public static void main(String[] args) {
 
    ApplicationContext context = new ClassPathXmlApplicationContext("myMetadata.xml");
    StudentService studentService = (StudentService) context.getBean("studentService");

    System.out.println("------Records Creation--------" );
     /* studentService.create("11","Tob Andrew", "Tob_Andrew@syntelic.com");
      studentService.create("12","Nancy Christy", "Nancy_Chr@syntelinc.com");
      studentService.create("15","Alwyn Dsouza", "Alwyn_D@syntelinc.com");*/

      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentService.listStudents();
      
      for (Student record : students) {
         System.out.print("ID : " + record.getStudentId() );
         System.out.print(", Name : " + record.getStudentName() );
         System.out.println(", Email : " + record.getStudentEmail());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      studentService.update("12", "Nancy_ty@syntelinc.com");

      System.out.println("----Listing Record with ID = 2 -----" );
      Student student = studentService.getStudent("12");
      System.out.print("ID : " + student.getStudentId() );
      System.out.print(", Name : " + student.getStudentName());
      System.out.println(", Email : " + student.getStudentEmail());
   }
}
