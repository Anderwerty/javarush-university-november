package com.javarush.module2.project.domain;

//class characteristics
public class BaseSettings {
    // singleton
    // multiton

    public static final BaseSettings WOLF_BASE_SETTING = new BaseSettings(50, 30, 3, 8);


    private final int value1;
    private final int value2;
    private final int value3;
    private final int value4;

    private BaseSettings(int value1, int value2, int value3, int value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue4() {
        return value4;
    }
}
