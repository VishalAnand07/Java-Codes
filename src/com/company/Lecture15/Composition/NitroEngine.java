package com.company.Lecture15.Composition;

public class NitroEngine implements Engine{

    @Override
    public void start() {
        System.out.println("start like a nitro super car");
    }

    @Override
    public void stop() {
        System.out.println(" stop like a nitro super car");

    }
}
