package me.prac.Book.Item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Check{
    public static int size = 10;
    public static void main(String[] args) {
        Set<Lark> exaltation = new HashSet<>();
    }

    public static class Lark {

    }

    public <T> T[] toArray(T[] a) {
        int size = 10;
        Object[] elements =new Object[10];

        if(a.length < size) {
            @SuppressWarnings("unchecked") T[] results = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return results;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if(a.length > size)
            a[size] = null;
        return a;
    }
}
