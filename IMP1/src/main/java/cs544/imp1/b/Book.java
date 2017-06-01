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
public class Book extends Product{
    private String title;

    public Book() {
    }

    public Book(String title, String name, String desc) {
        super(name, desc);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
