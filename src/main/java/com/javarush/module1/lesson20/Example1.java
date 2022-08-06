package com.javarush.module1.lesson20;

import static com.javarush.module1.lesson20.WorkDays.FRIDAY;
import static com.javarush.module1.lesson20.WorkDays.MONDAY;
import static com.javarush.module1.lesson20.WorkDays.TUESDAY;
import static com.javarush.module1.lesson20.WorkDays.WEDNESDAY;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(FRIDAY.toString());
        System.out.println(MONDAY.name());
        System.out.println(MONDAY.ordinal());

        final WorkDays workDays = WorkDays.valueOf("MONDAY");
        System.out.println(workDays);
        System.out.println(MONDAY == workDays);

        System.out.println(TUESDAY.toString());
//        WorkDays.TUESDAY.setUkrName("Вівторок");
        System.out.println(TUESDAY.toString());

        System.out.println(WEDNESDAY);


        System.out.println(TUESDAY.getClass().getName());
        System.out.println(WEDNESDAY.getClass().getName());

        System.out.println("=============================");
        for (WorkDays value : WorkDays.values()) {
            System.out.println(value);
        }



//        final WorkDays workDays1 = new WorkDays();
    }
}

enum WorkDays {
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY(){
        @Override
        public String toString() {
            return "WorkDays{" + this.ordinal() + " : " + this.name()
                    + "}";
        }
    },
    THURSDAY,
    FRIDAY("П'ятниця");

    private final String ukrName;

    private WorkDays() {
        this.ukrName = "";
    }

    private WorkDays(String ukrName) {
        this.ukrName = ukrName;
    }

    public String getUkrName() {
        return ukrName;
    }

    //
//    public void setUkrName(String ukrName) {
//        this.ukrName = ukrName;
//    }

    @Override
    public String toString() {
        return "WorkDays{" + this.ordinal() + " : " + this.name() + "," +
                "ukrainian name: " + ukrName
                + "}";
    }
}
