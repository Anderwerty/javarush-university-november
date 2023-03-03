package com.javarush.module3.lesson16_17.bridge.report;

import com.javarush.module3.lesson16_17.bridge.period.Period;

public class JsonReport extends AbstractReport implements Report {
    protected JsonReport(Period period) {
        super(period);
    }

    @Override
    public String generateReport() {
        String report = "{";
        report += period.generateHeader();
        report += "========================";
        report += period.generateFooter();
        report += "======================== }";

        return report;

    }
}
