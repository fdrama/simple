package org.example.design.duck.model;

import org.example.design.duck.fly.FlyWithWings;
import org.example.design.duck.quack.Quack;

/**
 * @author fdrama
 * @date 2022/04/06
 **/
public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }

}
