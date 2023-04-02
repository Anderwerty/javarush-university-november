package com.javarush.module3.lesson16_17.chainofresponsibility.example1;

import java.util.ArrayList;
import java.util.List;

public class FilterChainHandler implements Filter {

    private final List<Filter> filters = new ArrayList<>();

    public void register(Filter filter) {
        filters.add(filter);
    }

    @Override
    public void filter(Message message) {
        for (Filter filter : filters) {
            filter.filter(message);
        }
    }
}
