/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.cxm1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Ayu
 */
@Entity
        @SecondaryTable

{
SecondaryTable{name = "Patient", pkJoinColumns = }
} 
class Patient {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String street;
    private String zip;
    private String city;

    public Patient() {
    }

    public Patient(String name, String street, String zip, String city) {
        this.name = name;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
