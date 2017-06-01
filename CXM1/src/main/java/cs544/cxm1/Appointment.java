/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.cxm1;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Ayu
 */
@Entity 
public class Appointment {
    @Id
    @GeneratedValue 
    private int id ;
    private String appdate;
    private Patient patient;
    @Embedded 
    private Payment payment;
    private Doctor doctor;
    
    
    
}
