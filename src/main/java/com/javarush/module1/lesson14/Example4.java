package com.javarush.module1.lesson14;

public class Example4 {
    public static void main(String[] args) {
        Client client = new Client();
        Client.Address address = client.new Address();

        System.out.println(Client.userValue);
        Client.userStaticMethod();
    }
}

// non-static, non-static
class Client {
    public static int userValue = 0;

    private String name;
    //...
    private Address address;


    public static void userStaticMethod() {

        System.out.println("User static method");
    }

    // inner class
    public class Address {
//        public static int addressValue = 0; compilation error

        public String city;
        //...

        public void addressNonStaticMethod() {
            System.out.println(userValue);
            userStaticMethod();
            System.out.println("Address non static method");
        }
//
//        public static void addressStaticMethod() {
//            userStaticMethod();
//            System.out.println("Address static method");
//        }
    }

}
