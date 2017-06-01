/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.imp1.b;
import cs544.imp1.a.*;

import javax.persistence.Entity;

/**
 *
 * @author Ayu
 */
@Entity 

public class DVD  extends Product {
    
    private String gener;

    public DVD() {
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }
    
    
    
}
