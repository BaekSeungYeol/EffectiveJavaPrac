package me.prac.Book.Item8;

public class FinalizerExample {


    @Override
    protected final void finalize() throws Throwable {
        System.out.println("Clean up");
    }
    public void test() {
        System.out.println("TEST");
    }

}
