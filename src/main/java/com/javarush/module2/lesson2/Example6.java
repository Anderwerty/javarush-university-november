package com.javarush.module2.lesson2;

public class Example6 {
    public static void main(String[] args) {
        AClass[] aClasses = {new BClass(), new CClass()};
        for (AClass aClass : aClasses) {
            aClass.method();
        }
    }
}

class AClass {
    public void method() {
        System.out.println("method A-Class");
    }
}

class BClass extends AClass {
    @Override
    public void method() {
        System.out.println("method B-Class");
    }
}

class CClass extends AClass {
    @Override
    public void method() {
        System.out.println("method C-Class");
    }
}
