package com.cleo.JBDL.L1;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Starting car with "+engine.getName());
    }
}
