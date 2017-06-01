/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.amp2.studentcourse;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


/**
 *
 * @author Ayu
 */
@Entity
        
class Course {
    @Id 
    @GeneratedValue
    private int id;
    private String courseNumber;
    private String name; 
    
}
