package me.prac.Book.Chapter6.Item40;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bigram bigram = (Bigram) o;
        return first == bigram.first &&
                second == bigram.second;
    }

    @Override
    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for(int i=0; i<10; ++i)
            for(char ch = 'a'; ch <= 'z'; ++ch)
                s.add(new Bigram(ch,ch));

        System.out.println(s.size()); // 260
    }
}
