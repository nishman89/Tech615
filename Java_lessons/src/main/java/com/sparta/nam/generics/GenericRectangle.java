package com.sparta.nam.generics;

public class GenericRectangle<T extends Number> {
    private T width;
    private T length;

    public GenericRectangle(T width, T length) {
        this.width = width;
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }


}
