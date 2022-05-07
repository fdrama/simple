package org.example.design.duck.model;

import org.example.design.duck.fly.FlyRocketPowered;

/**
 * @author fdrama
 * @date 2022/04/06
 **/
public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        mallardDuck.performQuack();

    }
}
