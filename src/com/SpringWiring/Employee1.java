/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringWiring;

public class Employee1 {
 
    private Address1 address1;

    public Employee1(Address1 address1) {
        this.address1 = address1;
    }  

    @Override
    public String toString() {
        return "Employee{" + "address=" + address1 + '}';
    }
 
    
}
