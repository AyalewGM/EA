/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544;

import java.util.List;

/**
 *
 * @author Ayu
 */
public class B {

    private List<D> items;

    public B() {
        System.out.println("Constructor B");
    }

    public void init() {
        System.out.println("init B has " + items.size() + " item(s)");
    }

    public void destroy() {
        System.out.println("destroy B has " + items.size() + " item(s)");
    }

    public List<D> getItems() {
        return items;
    }

    public void setItems(List<D> items) {
        this.items = items;
    }
}
