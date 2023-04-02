package com.javarush.module3.lesson20;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Example1 {
    public static void main(String[] args) {
        String phrase = "abcd de";
        System.out.println(StringUtils.capitalize(phrase));
        System.out.println(phrase.toUpperCase().charAt(0) + phrase.substring(1));

        System.out.println(StringUtils.compare("a", null, false));

        String la = "   ";
        System.out.println("=".repeat(10));
        System.out.println(StringUtils.isEmpty(la));
        System.out.println(la.isEmpty());

        System.out.println(la.isBlank());

        System.out.println(StringUtils.isBlank(la));

        String[] words = {"Hello", "all!"};
        String sentence = String.join(" ",words);
        System.out.println(sentence);

//        ToStringBuilder.reflectionToString()

    }
}
