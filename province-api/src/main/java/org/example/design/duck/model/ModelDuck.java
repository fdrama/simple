package org.example.design.duck.model;

import org.example.design.duck.fly.FlyNoWay;
import org.example.design.duck.quack.MuteQuack;

/**
 * @author fdrama
 * @date 2022/04/06
 **/
public class ModelDuck extends Duck {

    ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
