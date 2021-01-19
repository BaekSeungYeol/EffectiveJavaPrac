package me.prac.Book.Item8;

public class SampleRunner {

    public static void main(String[] args) {
        SampleRunner runner = new SampleRunner();
        runner.run();

    }
    private void run() {
        FinalizerExample finalizerExample = new FinalizerExample();
        finalizerExample.test();
    }
}
