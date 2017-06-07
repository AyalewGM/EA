/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs544.sdi2;

/**
 *
 * @author Ayu
 */
public class InventoryServices implements IInventoryService{

    public int getNumberInStck(int productNumber) {
        return productNumber-20;
    }
    
}
