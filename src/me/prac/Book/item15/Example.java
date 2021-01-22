package me.prac.Book.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {

    //보안 허점이 숨엄 있다.
    //public static final Thing[] VALUES = {};

    private static final Thing[] PRIVATE_VALUES = {};

    public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES)); // 1

    public static final Thing[] values() { // 2
        return PRIVATE_VALUES.clone();
    }

}
