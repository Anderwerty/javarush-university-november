package com.javarush.module2.lesson7;

public class Example6 {
    public static void main(String[] args) {
        Comparable<User> comparable = (user)-> {
            User u = new User();
            return u.name.length()- user.name.length();
        };
    }
}


class User implements Comparable<User>{
    String name;

    @Override
    public int compareTo(User user) {
        return this.name.length() - user.name.length();
    }
}



