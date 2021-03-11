package me.prac.Book.Item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Stamp {
    private  static Collection<Stamp> stamps = new ArrayList();

    public static void main(String[] args) {
//        stamps.add(new Coin());

        for(Iterator i = stamps.iterator(); i.hasNext(); ) {
            Stamp stamp = (Stamp) i.next(); // ClassCastException
        }


        List list = new ArrayList<String>();
      //  List<Object> list2 = new ArrayList<String>();
    }

    public static class Coin {
    }
}
