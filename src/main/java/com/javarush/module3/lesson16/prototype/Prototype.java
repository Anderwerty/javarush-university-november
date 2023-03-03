package com.javarush.module3.lesson16.prototype;

public class Prototype implements Cloneable {
    private String value;

    public Prototype(int number) {
        this.value = meggaMethod(number);
    }

    public Prototype(Prototype source){
        this.value = source.value;
    }

    private String meggaMethod(int number) {
        //some logic
        return "value" + number;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
