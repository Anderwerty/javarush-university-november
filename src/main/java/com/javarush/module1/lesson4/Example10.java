package com.javarush.module1.lesson4;

public class Example10 {
    public static void main(String[] args) {
        int status = 1;
        String result;

        if (status == 1) {
            result = "Go";
        } else {
            if (status == 2) {
                result = "Ready";
            } else {
                result = "Wait";
            }
        }

        System.out.println(result);

        if (status == 1) {
            result = "Go";
        } else {
            result = (status == 2) ? "Ready" : "Wait";
        }

        //========================

        if (status == 1) { // result = (status == 1)?"Go":((status == 2) ? "Ready" : "Wait")
            result = "Go";
        } else {
            result = ((status == 2) ? "Ready" : "Wait");
        }
        //===================================

        result = status == 1 ? "Go" : status == 2 ? "Ready" : "Wait";


        System.out.println(status == 1 ? "Go" : status == 2 ? "Ready" : "Wait");
    }
}
