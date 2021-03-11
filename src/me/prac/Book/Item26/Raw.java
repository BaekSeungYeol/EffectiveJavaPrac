package me.prac.Book.Item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Raw {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        //unsafeAdd(strings, Integer.valueOf(42));
        String s= strings.get(0); // ClassCastException
    }

    private static void colTest(Collection<?> list) {
        //list.add("verboten");
    }
    private static void unsafeAdd(List<Object> list, Object o) {
        list.add(o);


        if(o instanceof Set) { // 로 타입
            Set<?> s = (Set<?>) o; // 와일드카드 타입
        }
    }

    static int numElementsInCommon(Set<?> s1, Set<?> se2) {

        return 0;

    }
}
