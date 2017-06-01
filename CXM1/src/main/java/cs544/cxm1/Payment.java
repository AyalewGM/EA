/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.cxm1;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 *
 * @author Ayu
 */
@Embeddable
class Payment {

    private String payDate;
    private double amount;

    public Payment() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
