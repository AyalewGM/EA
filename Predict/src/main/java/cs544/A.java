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
public class A {

    private B b;

    public A(B b, D d) {
        System.out.println("Constructor A");
        b.getItems().add(d);
        this.b = b;
    }

    public void doSomething() {
        for (D d : b.getItems()) {
            System.out.println(d.getText());
        }
    }
}
