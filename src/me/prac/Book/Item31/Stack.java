package me.prac.Book.Item31;

import java.util.*;

public class Stack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        this.elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public E pop() {
        if(size == 0) throw new EmptyStackException();

        E result = elements[size--];
        elements[size] = null;
        return result;
    }
    private void ensureCapacity() {
        if(elements.length == size) {
            this.elements = Arrays.copyOf(elements, 2*size+1);
        }
    }
    private boolean isEmpty() {
        return size == 0;
    }

    public void pushAll(Iterable<? extends E> src) {
        for(E e : src)
            push(e);
    }

    public void popAll(Collection<? super E> dst) {
        while(!isEmpty()) dst.add(pop());
    }

    public static void main(String[] args) {

        Collection<Object> collection = new ArrayList<>();
        Stack<Number> numberStack = new Stack<>();
        numberStack.popAll(collection);

        
//        Stack<Number> numberStack = new Stack<>();
//        Iterable<Integer> integers = List.of(1,2,3,4,5);
//        numberStack.pushAll(integers);
    }
}
