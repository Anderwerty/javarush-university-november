package com.javarush.module2.lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

public class Example3 {
    public static void main(String[] args) {
        Collection<    Callable<Void>    > tasks = new ArrayList<Callable<Void>>();
        VoidCallable voidCallable = new VoidCallable();
        Void call = voidCallable.call();



    }
}

class AC implements Callable<Callable<Void>>{

    @Override
    public Callable<Void> call() throws Exception {
        return null;
    }
}

class VoidCallable implements Callable<Void>{

    @Override
    public Void call() {
        System.out.println();

        return null;
    }
}
