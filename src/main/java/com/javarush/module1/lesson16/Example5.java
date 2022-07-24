package com.javarush.module1.lesson16;

public class Example5 {
    public static void main(String[] args) {
        IntContainer intContainer = new IntContainer(1);
        Integer integerValue = intContainer.getValue();


        StringContainer stringContainer = new StringContainer("string");
        String stringValue = stringContainer.getValue();

        //....

        // put Integer into container
        Container container = new Container("1");

        //Null Object pattern
        Integer integer = -1;
        Object value = container.getValue();

        if(value instanceof Integer){
            integer = (Integer) value;
        }

        System.out.println(integer.intValue());

        // Container container =
        // new Container("1");
        GenericContainer<Integer> container1 =
                new GenericContainer<>(100);

        Integer value1 = container1.getValue();

        GenericContainer<GenericContainer<String>> container2 =
                new GenericContainer<>(new GenericContainer<>("String"));

        GenericContainer<Integer>[] items = new GenericContainer[10];
        items[1]= new GenericContainer<>(1);

        GenericContainer container3 = new GenericContainer("string");

        Object value2 = container3.getValue();


    }
}

class IntContainer {
    private Integer value;

    public IntContainer(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    //....
}

class StringContainer {
    private String value;

    public StringContainer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    //....
}

class Container {
    private Object value;

    public Container(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    //....
}

// better instead of TYPE use just T
class GenericContainer <TYPE> {
    private TYPE value;

    public GenericContainer(TYPE value) {
        this.value = value;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }
    //....
}



