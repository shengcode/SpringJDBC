/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.springJDBC;


public class Student {
    private String studentId;
    private String studentName;
    private String studentEmail;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public String getStudentName() {
    return studentName;
    }

    public void setStudentName(String studentName) {
    this.studentName = studentName;
    }

    public String getStudentEmail() {
    return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
    this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
    return "Student [name is =" + studentName + ", email is =" + studentEmail + "]";
    }
 
}
