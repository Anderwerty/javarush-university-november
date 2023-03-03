package com.javarush.module3.lesson16.abstractfactory;

import com.javarush.module3.lesson16.factorymethod.IExample;

public interface AbstractFactory {

    IExample createExample();

    IAnswer getAnswer(IExample example);
}
