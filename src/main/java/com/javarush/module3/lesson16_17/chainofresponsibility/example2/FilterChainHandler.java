package com.javarush.module3.lesson16_17.chainofresponsibility.example2;

import java.util.ArrayList;
import java.util.List;

public class FilterChainHandler implements Filter {

    private final List<Filter> filters = new ArrayList<>();

    public void register(Filter filter) {
        filters.add(filter);
    }

    @Override
    public Message filter(Message message) {
//        Message message1 = filters.get(0).filter(message);
//        ///..
//        Message messagen_1 = null;
//        int n = 100;
//        Message messagen = filters.get(n).filter(messagen_1);
//
//        return messagen;

        Message tempMessage = message;
        for (Filter filter : filters) {
            tempMessage = filter.filter(tempMessage);
        }
        return tempMessage;
    }
}
