package me.seungyeol.Book.Item10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "Polish";

        List<CaseInsensitiveString> list = new ArrayList<>();

        boolean equals1 = s.equals(cis);
        boolean equals2 = cis.equals(s);
        System.out.println(equals1);
        System.out.println(equals2);
    }
}
