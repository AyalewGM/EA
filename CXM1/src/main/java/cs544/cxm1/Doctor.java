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
        
class Doctor {
    @Id
    @GeneratedValue 
    private int id;
    private String doctorTpe;
    private String firstName;
    private String lastName;

    public Doctor() {
    }

    public Doctor(String doctorTpe, String firstName, String lastName) {
        this.doctorTpe = doctorTpe;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getDoctorTpe() {
        return doctorTpe;
    }

    public void setDoctorTpe(String doctorTpe) {
        this.doctorTpe = doctorTpe;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    
}
