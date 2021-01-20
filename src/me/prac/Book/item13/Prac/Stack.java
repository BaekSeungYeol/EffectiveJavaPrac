package me.prac.Book.item13.Prac;

import me.prac.Book.item13.EmptyStackException;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object data) {
        ensureCapacity();
        elements[size++] = data;
    }

    public Object pop() {
        if(size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = this.elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
