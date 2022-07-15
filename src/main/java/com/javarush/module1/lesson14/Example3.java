package com.javarush.module1.lesson14;

import com.javarush.module1.lesson14.User.Address;

public class Example3 {
    public static void main(String[] args) {
//        User.userValue = 10;
        Address address = new Address();
        address.city= "Kyiv";

//        System.out.println(Address.addressValue);
    }
}

// non-static, static
class User {
    private static int userValue = 0;

    private String name;
    //...
    private Address address;


    public static void userStaticMethod() {
        System.out.println(Address.addressValue);

        System.out.println("User static method");
    }

    // nested class
    public static class Address {
        private static int addressValue = 0;

        public String city;
        //...

        public void addressNonStaticMethod() {
            System.out.println(userValue);
            userStaticMethod();
            System.out.println("Address non static method");
        }

        public static void addressStaticMethod() {
            userStaticMethod();
            System.out.println("Address static method");
        }
    }

}
