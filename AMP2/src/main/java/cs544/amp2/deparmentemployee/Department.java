/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.amp2.deparmentemployee;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Ayu
 */
@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany
            @JoinColumn(name="id")
    List<Employee > empList = new ArrayList<>();
    
    public Department(){}

    public Department(String name  ) {
        this.name = name;
        
    }

    public void addEmployee(Employee employee){
    empList.add(employee);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
