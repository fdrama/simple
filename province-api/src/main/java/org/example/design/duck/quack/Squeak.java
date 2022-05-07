package org.example.design.duck.quack;

/**
 * @author fdrama
 * @date 2022/04/06
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
