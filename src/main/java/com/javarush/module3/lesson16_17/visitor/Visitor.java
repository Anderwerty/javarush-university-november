package com.javarush.module3.lesson16_17.visitor;

class Example1{
    public static void main(String[] args) {
        Restoran restoran = new Restoran();
        Client<Restoran> stepan = new Client<>();
        String feedbackFromStepan = restoran.accept(stepan);

        Revisor<Restoran> revisor = new Revisor<>();

        String feedbackFromRevisor = restoran.accept(revisor);
    }
}
public interface Visitor<E> {
    String execute(E e);
}

class Restoran {

    public String accept(Visitor<Restoran> visitor) {
        String feedback = visitor.execute(this);

        return feedback;
    }
}

class Client<E> implements Visitor<E> {

    @Override
    public String execute(E place) {
        //some logic

        return "my feedback";
    }
}

class Revisor<E> implements Visitor<E> {

    @Override
    public String execute(E e) {
        return null;
    }
}
