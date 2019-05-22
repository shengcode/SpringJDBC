/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringWiring;


public class Address {
     private String Street;
    private String city;
 
    public String getStreet() {
        return Street;
    }
 
    public void setStreet(String street) {
        Street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    @Override
    public String toString() {
        return "EmployeeAddress [Street=" + Street + ", city=" + city + "]";
    }

}
