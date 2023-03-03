package com.javarush.module3.lesson16.bridge.period;

public class WeekPeriod implements Period{
    @Override
    public String generateHeader() {
        return "Week header";
    }

    @Override
    public String generateFooter() {
        return "Week footer";
    }
}
