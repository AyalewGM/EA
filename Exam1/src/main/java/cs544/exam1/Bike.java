/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.exam1;

import javax.persistence.*;
 

/**
 *
 * @author Ayu
 */
class Bike {

    @Id
    @GeneratedValue
    private int id;
    private String description;
    private double hourlyRate;
    @OneToOne(cascade = CascadeType.ALL)
    private Rental latest;
    @OneToMany(mappedBy = "bike", cascade = CascadeType.ALL)
    private List<Rental> rentals = new ArrayList<>();
}
