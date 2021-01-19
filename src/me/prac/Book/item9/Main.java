package me.prac.Book.item9;

public class Main {
    public static void main(String[] args) {
        try(MyResource myResource = new MyResource();
            MyResource myResource1 = new MyResource())
        {
            myResource.doSomething();
            myResource1.doSomething();
        }
    }

}

