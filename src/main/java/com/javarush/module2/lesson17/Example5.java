package com.javarush.module2.lesson17;

import java.lang.reflect.Field;

public class Example5 {
    public static void main(String[] args) throws Exception {
        Client client = new Client();

        Class<Client> clientClass = Client.class;
        Field fieldNumber = clientClass.getDeclaredField("value");
        fieldNumber.setAccessible(true);

        System.out.println(fieldNumber.getInt(client));
        fieldNumber.setInt(client, 0);


        Field strValue = clientClass.getDeclaredField("VALUE");
        strValue.setAccessible(true);
        System.out.println(strValue.get(null));
        strValue.set(null, "hi");
        System.out.println(Client.VALUE);

    }
}

class Client {

    public final int number = 10;
    public int value = 100;

    public static String strValue = "hello";
    public static final String VALUE = "hello";
}
