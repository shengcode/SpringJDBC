
package com.study.springJDBC;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentService implements StudentDAO{
 
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   @Override
   public void create(String Id, String name, String email) {
      String SQL = "insert into Student (Student_Id, Student_Name,email) values (?,?,?)";
      jdbcTemplateObject.update( SQL,Id,name,email);
      System.out.println("Created Record Name = " + name + " Email = " + email);
      return;
   }
   public Student getStudent(String id) {
      String SQL = "select * from Student where Student_id = ?";
      Student student = jdbcTemplateObject.queryForObject(SQL, 
         new Object[]{id}, new StudentRowMapper());
      
      return student;
   }
   public List<Student> listStudents() {
      String SQL = "select * from Student";
      List <Student> students = jdbcTemplateObject.query(SQL, new StudentRowMapper());
      return students;
   }
   public void delete(String id) {
      String SQL = "delete from Student where Student_id = ?";
      jdbcTemplateObject.update(SQL, id);
      System.out.println("Deleted Record with ID = " + id );
      return;
   }
   public void update(String id, String email){
      String SQL = "update Student set email = ? where Student_id = ?";
      jdbcTemplateObject.update(SQL, email, id);
      System.out.println("Updated Record with ID = " + id );
      return;
   }

    
}
