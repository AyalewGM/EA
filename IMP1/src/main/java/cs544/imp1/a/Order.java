/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.imp1.a;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Ayu
 */
@Entity 
public class Order {
    @Id
    @GeneratedValue 
    private int orderId;
    private Date date;
    @ManyToOne
    @JoinColumn(name  = "CustomerID")
    private Customer customer;
    @ManyToOne 
            @JoinColumn(name = "OrderID")
    private List<OrderLine> orderLines = new ArrayList<>();

    public Order() {
    }

    public Order(Date date){
    this.date= date;
    }
            
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public void addOrderLines(OrderLine line){
    this.orderLines.add(line);
    
    }
    
    
    
}
