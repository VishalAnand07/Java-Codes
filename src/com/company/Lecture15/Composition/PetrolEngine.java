package com.company.Lecture15.Composition;

public class PetrolEngine implements Engine{


    @Override
    public void start() {
        System.out.println("start like a petrol car");
    }

    @Override
    public void stop() {
        System.out.println(" stop like a petrol car");

    }
}
