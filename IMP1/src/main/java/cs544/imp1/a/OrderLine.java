/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.imp1.a;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ayu
 */
@Entity 
public class OrderLine {
    @Id 
    @GeneratedValue
    private int orderLineId;
    private int quantity;
   
    @ManyToOne 
    @JoinColumn(name= "Product_Id")
    private Product product;

    public OrderLine() {
    }

    public OrderLine(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
    
    
}
