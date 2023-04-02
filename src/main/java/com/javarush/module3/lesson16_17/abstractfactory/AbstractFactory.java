package com.javarush.module3.lesson16_17.abstractfactory;

import com.javarush.module3.lesson16_17.factorymethod.IExample;

public interface AbstractFactory {

    IExample createExample();

    IAnswer getAnswer(IExample example);
}
