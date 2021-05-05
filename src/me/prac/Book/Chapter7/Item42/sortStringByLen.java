package me.prac.Book.Chapter7.Item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class sortStringByLen {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);

        Collections.sort(words,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        words.sort(comparingInt(String::length));
    }
}
