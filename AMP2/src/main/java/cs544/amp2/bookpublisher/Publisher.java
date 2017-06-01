/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.amp2.bookpublisher;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Ayu
 */
public class Publisher {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    public Publisher(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
