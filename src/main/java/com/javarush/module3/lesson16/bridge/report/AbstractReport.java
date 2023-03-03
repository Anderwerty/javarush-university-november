package com.javarush.module3.lesson16.bridge.report;

import com.javarush.module3.lesson16.bridge.period.Period;

public abstract class AbstractReport implements Report {

    protected final Period period;

    protected AbstractReport(Period period) {
        this.period = period;
    }

}
