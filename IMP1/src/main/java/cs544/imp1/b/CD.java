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
public class CD extends Product  {
    
    private String artist;
    public CD(){}

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    
}
