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
public class CalculatorService implements ICalculate {
private Pair pair; 


    public int calc(Pair pair) {
        char operator = pair.getOperator();
        int number = pair.getNumber();
        
        switch(operator ){
            case '+':
                return number++;
               
            case '-':
                return number--;
            case '*':
                return number*2;
            case '/':
                return number /2;
            default:
                return -1;                
     
         
    }
    } 
}
