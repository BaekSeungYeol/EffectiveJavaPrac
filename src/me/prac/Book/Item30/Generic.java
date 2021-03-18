package me.prac.Book.Item30;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Generic {

//    public static Set union(Set s1, Set s2) {
//        Set result = new HashSet(s1);
//        result.addAll(s2);
//        return result;
//    }

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> integers = Set.of(1,3,5);
        Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
        Set<Number> numbers = union(integers, doubles);



        //        Set<String> guys = Set.of("톰", "딕", "해리");
//        Set<String> stooges = Set.of("래리", "모에", "컬리");
//        Set<String> aflCio = union(guys, stooges);
//        System.out.println(aflCio); // [톰, 해리, 래리, 딕, 컬리, 모에]
//
//        String[] strings = {"삼베", "대마", "나일론"};
//        UnaryOperator<String > sameString = identityFunction();
//        for (String string : strings) {
//            System.out.println(sameString.apply(string));
//        }
//
//        Number[] numbers = {1, 2.0, 3L};
//        UnaryOperator<Number> sameNumber = identityFunction();
//        for (Number number : numbers) {
//            System.out.println(sameNumber.apply(number));
//        }
    }

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;
    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }


}
