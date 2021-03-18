package me.prac.Book.Item28;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserG<T> {
    private final List<T> choiceArray;

    public ChooserG(Collection<? extends T> choiceArray) {
        this.choiceArray = new ArrayList<>(choiceArray);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray.get(rnd.nextInt(choiceArray.size()));
    }

}
