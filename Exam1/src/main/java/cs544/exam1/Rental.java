/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.exam1;

/**
 *
 * @author Ayu
 */
import java.util.Date;
 import javax.persistence.*;

@Entity
public class Rental {

    @Id
    @GeneratedValue
    private long id;
    private Date start;
    private Date stop;
    private double downpay;
    private double income;
    @ManyToOne
    private Bike bike;
    @Embedded
    private Customer customer;

    
    
    
}