package com.javarush.module2.lesson7;

public class Example1 {
    public static void main(String[] args) {
//        IntegerContainer integerContainer = new IntegerContainer(1);
//        Integer intValue = integerContainer.getValue();

        //  Integer, Long, String
        Container container = new Container(1);

        container.manipulateWithValue();
    }
}
// rich domain model vs anemic domain model
class Container {
    private final Object value;

    Container(Object value) {
        this.value = (Object) value;
    }

//    public Object getValue() {
//        return value;
//    }

    public void manipulateWithValue(){
        if (value instanceof Long longValue) {
            System.out.println("Number");

            System.out.println(longValue.longValue());
        } else if (value instanceof Integer integer) {
            System.out.println("Integer");

            System.out.println(integer.longValue());
        } else if (value instanceof String line) {
            System.out.println("String");

            System.out.println(line.toUpperCase() + ".....");
        } else {
            String message = value == null ? "null" :value.getClass().getName();
            throw new UnsupportedTypeException("Unsupported type: " + message);
        }
    }
}

//class IntegerContainer {
//    private final Integer value;
//
//    IntegerContainer(Integer value) {
//        this.value = value;
//    }
//
//    public Integer getValue() {
//        return value;
//    }
//}
//
//class StringContainer {
//    private final String value;
//
//    StringContainer(String value) {
//        this.value = value;
//    }
//
//    public String getValue() {
//        return value;
//    }
//}
//
//class DoubleContainer {
//    private final Double value;
//
//    DoubleContainer(Double value) {
//        this.value = value;
//    }
//
//    public Double getValue() {
//        return value;
//    }
//}

class UnsupportedTypeException extends RuntimeException {
    public UnsupportedTypeException() {
    }

    public UnsupportedTypeException(String message) {
        super(message);
    }
}
