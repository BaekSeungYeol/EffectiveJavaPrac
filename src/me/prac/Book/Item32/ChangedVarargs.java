package me.prac.Book.Item32;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChangedVarargs {

    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // 힙 오염 발생
        String s = stringLists[0].get(0); // ClassCastException
    }

    static <T> T[] toArray(T... args) {
        return args;
    }


    static <T> List<T> flatten(List<List<? extends T>> lists) {
        List<T> result = new ArrayList<>();
        for( List<? extends  T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

    static <T> List<T> pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return List.of(a,b);
            case 1: return List.of(a,c);
            case 2: return List.of(b,c);
        }
        throw new AssertionError();
    }

    public static void main(String[] args) {

        List<String> attributes = pickTwo("좋은", "빠른", "저렴한");

        dangerous(List.of("hi"), List.of("bye"));
//
    }
}

