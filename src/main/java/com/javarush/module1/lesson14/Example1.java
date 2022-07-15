package com.javarush.module1.lesson14;

public class Example1 {
    public static void main(String[] args) {
//        Cat cat = new Cat();
        Cat cat = null;
//        cat.setAge(100);
//
//        System.out.println(cat.getAge());

//        cat.counter = 10;

        System.out.println(cat.counter);


        Cat borka = new Cat();
        Cat tom = new Cat();
        System.out.println(Cat.counter);

        tom.setAge(1);// tom -> 1 year
        borka.setAge(4); // borka -> 4 years

        System.out.println(tom.getAge()); // 1
        System.out.println(borka.getAge()); // 4
    }
}

class Cat {
    public static int counter = 0;

    private String name;
    private int age;
    private boolean isMale;

    public Cat() {
        counter++;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }
}
