package me.prac.Book.Item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E>{

    private int addCount = 0;
    public InstrumentedSet(Set<E> s) {super(s); }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() { return addCount; }

    public static void main(String[] args) {
        InstrumentedSet set = new InstrumentedSet(new HashSet<String>());
        set.addAll(List.of("hi", "bye", "good"));
        System.out.println(set.getAddCount()); // 3
    }
}
