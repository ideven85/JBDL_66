package com.cleo.JBDL.L1;

public class CompositionDemo {

    public static void main(String[] args) {

        Engine engine = new Engine(1500,"Max Power");

        Car car = new Car(engine);
        car.start();


        Car car2 = new Car(engine);
        car2.start();
    }
}
