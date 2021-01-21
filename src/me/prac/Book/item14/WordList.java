package me.prac.Book.item14;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Comparable 구현 시의 이점 (87쪽)
public class WordList {
    public static void main(String[] args) {
//        Set<String> s = new TreeSet<>();
//        s.add("c");
//        s.add("b");
//        s.add("a");
//        Collections.addAll(s, args);
//        System.out.println(s); // [a, b, c]

        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");
        System.out.println(b1.equals(b2)); // false

        HashSet<BigDecimal> hashSet = new HashSet<>();
        hashSet.add(b1); hashSet.add(b2);
        System.out.println(hashSet.size()); // 2
        TreeSet<BigDecimal> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet.size()); // 1
    }
}
