package com.javarush.module3.lesson16.bridge.period;

public class MonthPeriod implements Period{
    @Override
    public String generateHeader() {
        return "Month header";
    }

    @Override
    public String generateFooter() {
        return "Month  footer";
    }
}
