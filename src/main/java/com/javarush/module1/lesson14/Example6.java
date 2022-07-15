package com.javarush.module1.lesson14;

//import static com.javarush.module1.lesson14.Outer.Nested.NESTED_MAX_SIZE;

public class Example6 {
    public static void main(String[] args) {
//        new Outer();

//        new Outer.Nested();

        System.out.println(com.javarush.module1.lesson14.Outer.Nested.NESTED_MAX_SIZE);

    }
}

class Outer {
    public static final int OUTER_MAX_SIZE; // try with initialization here

    static {
        OUTER_MAX_SIZE = com.javarush.module1.lesson14.Outer.Nested.NESTED_MAX_SIZE;//?
        System.out.println("Outer: static block -1");
    }

    {
        System.out.println("Outer: non-static block -1");
    }

    {
        System.out.println("Outer: non-static block -2");
    }

    public Outer() {
        System.out.println("Outer: constructor");
    }

    {
        System.out.println("Outer: non-static block -3");
    }

    static {
        System.out.println("Outer: static block -2");
    }


    public static class Nested  {
        public static final int NESTED_MAX_SIZE; // try with initialization here

        static {
            NESTED_MAX_SIZE = 10;//?
            System.out.println("Nested: static block -1");
        }

        {
            System.out.println("Nested: non-static block -1");
        }

        {
            System.out.println("Nested: non-static block -2");
        }

        public Nested() {
            System.out.println("Nested: constructor");
        }

        {
            System.out.println("Nested: non-static block -3");
        }

        static {
            System.out.println("Nested: static block -2");
        }
    }
}

