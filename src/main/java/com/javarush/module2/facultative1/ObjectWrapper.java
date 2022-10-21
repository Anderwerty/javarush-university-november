package com.javarush.module2.facultative1;

import java.util.function.Function;

public class ObjectWrapper<T> {

    public static final ObjectWrapper EMPTY = new ObjectWrapper(null);

    private final T value;

    private ObjectWrapper(T value) {
        this.value = value;
    }

    public static <T> ObjectWrapper<T> of(T value) {

        if (value == null) {
            throw new IllegalArgumentException();
        }

        return new ObjectWrapper<>(value);
    }

    public boolean isEmpty() {
        return value == null;
    }

    public static <T> ObjectWrapper<T> ofNullable(T value) {
        return value == null ? EMPTY : new ObjectWrapper<>(value);
    }

    public <R> ObjectWrapper<R> map(Function<T, R> mapper) {
        if (isEmpty()) {
            return EMPTY;
        }

        return new ObjectWrapper<>(mapper.apply(value));
    }

    public T get() {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        return value;
    }
}
