/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs544.sdi1;

/**
 *
 * @author Ayu
 */
public class Greeting {
    private String greeting;
    public Greeting(){}
    public Greeting(String greeting){
    this.greeting=greeting;
    }
    public void sayHello(){
    System.out.println(greeting );
    
    }
    public void setGreeting(String greeting ){
    this.greeting=greeting;
    
    }
}
