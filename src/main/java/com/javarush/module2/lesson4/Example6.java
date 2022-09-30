package com.javarush.module2.lesson4;

public class Example6 {
    public static void main(String[] args) throws CloneNotSupportedException {
//        SecurityA securityA = new SecurityA();
//        if (securityA instanceof SecurityInterface) {
//            System.out.println("yes");
//            SecurityInterface securityInterface = securityA;
//        }

        MyExample myExample = new MyExample(100);
        MyExample cloneMyExample =(MyExample) myExample.clone();
        System.out.println(cloneMyExample.getValue());
    }
}

interface SecurityInterface {
    // is empty
}

class SecurityA implements SecurityInterface {
//...
}

class MyExample implements Cloneable {

    private  final int value;

    MyExample(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
