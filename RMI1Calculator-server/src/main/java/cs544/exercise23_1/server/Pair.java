/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs544.exercise23_1.server;

/**
 *
 * @author Ayu
 */
public class Pair {
    private int number;
    private char operator; 
    public Pair(){}
    public Pair(int number,char operator  ){
    this.number=number;
    this.operator= operator; 
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
}
