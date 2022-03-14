package com.company;

public class Box<T> {
    private T id;

    public Box(T id) {
        this.id = id;

    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                '}';
    }

    public static <T> Box method() {
        Box box1 = new Box(12345);
        return box1;
    }
}
