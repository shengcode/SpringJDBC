/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.springJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class StudentRowMapper implements RowMapper<Student>{ 
    @Override
    public Student mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Student student = new Student();
        student.setStudentId(resultSet.getString(1));
        student.setStudentName(resultSet.getString(2));
        student.setStudentEmail(resultSet.getString(3));
        return student;
    } 
}
