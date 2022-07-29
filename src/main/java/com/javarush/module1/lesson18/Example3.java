package com.javarush.module1.lesson18;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Example3 {
    public static void main(String[] args) {
        Map<B, Integer> map = new HashMap<>();
        B b1 = new B(1);
        B b3 = new B(3);
        B b2 = new B(2);

        map.put(b1, 1);
        map.put(b2, 2);
        map.put(b3, 3);
        map.put(new B(100), 100);
        map.put(new B(15), 15);
        map.put(new B(16), 16);
        map.put(new B(21), 21);

        System.out.println(map);

        Set<Map.Entry<B, Integer>> entries = map.entrySet();
        System.out.println("===================================");
        for (Map.Entry<B, Integer> entry : entries) {
            System.out.println(entry);
        }

        System.out.println(map.get(b1));
        System.out.println("After changes");

//        b2.setValue(20);

        System.out.println(map.get(b2));
        for (Map.Entry<B, Integer> entry : entries) {
            System.out.println(entry);
        }

        B b2copy = new B(2);

        System.out.println(map.get(b2copy));

        TreeMap<B, Integer> treeMap = new TreeMap<>(new BComparator());
        treeMap.put(new B(10), 10);

//        Collections.min()

    }
}

//LRU cache java linkedHashMap
class B /*implements Comparable<B>*/ {
    public final int value;

    public B(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        B b = (B) o;
        return value == b.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "B{" +
                "value=" + value +
                '}';
    }

    //    @Override
    public int compareTo(B that) {
//        if(this.value == that.value){
//            return 0;
//       }
//        if(this.value> that.value){
//            return 1;
//        } else {
//            return -1;
//        }

        return this.value - that.value; //?
    }
}

class BComparator implements Comparator<B> {

    @Override
    public int compare(B o1, B o2) {
        return o1.value - o2.value;
    }
}
