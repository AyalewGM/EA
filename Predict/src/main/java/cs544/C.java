/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544;

/**
 *
 * @author Ayu
 */
public abstract class C {

    private String text;

    public C() {
        System.out.println("Constructor C");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
