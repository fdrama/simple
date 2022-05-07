package org.example.design.duck.fly;

/**
 * @author fdrama
 * @date 2022/04/06
 **/
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
