package com.company.Lecture15.Composition;

public class Car {
    private PetrolEngine engine;
    private GenericBrake brake;
    public Car(){
        engine =new PetrolEngine();
        brake=new GenericBrake();
    }
    public void Start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
}
