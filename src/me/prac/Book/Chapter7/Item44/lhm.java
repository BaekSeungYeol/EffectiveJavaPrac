package me.prac.Book.Chapter7.Item44;

import java.util.LinkedHashMap;
import java.util.function.*;

public class lhm {
    public static void main(String[] args) {

        IntPredicate p = i -> ( i > 3);
        LongBinaryOperator bo = Long::sum;


        ObjDoubleConsumer<Integer> c = (i, d) -> System.out.println(i + d);
        c.accept(3,3.0); // 6.0


    }
}
