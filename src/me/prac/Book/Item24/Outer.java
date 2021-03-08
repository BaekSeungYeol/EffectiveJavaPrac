package me.prac.Book.Item24;

import java.util.HashMap;

public class Outer {

    public void SayHello() {
        System.out.println("Hello");
    }
    private class Inner {

        public Inner() {
        }

        public void SayBye() {
            System.out.println("Bye");
            class KoreaSayBye {
                public void sayGoodBye() {
                    System.out.println("잘가");
                }
            }
            KoreaSayBye koreaSayBye = new KoreaSayBye();
            koreaSayBye.sayGoodBye();
        }
        public void SayHello() {
            Outer.this.SayHello(); //Hello
            this.SayBye(); // Bye
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.SayBye();
        // Inner inner2 = new Inner();

        HashMap<Integer, Integer> map = new HashMap<>();
    }

}


