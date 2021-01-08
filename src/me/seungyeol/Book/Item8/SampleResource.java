package me.seungyeol.Book.Item8;

import java.lang.ref.Cleaner;

public class SampleResource implements AutoCloseable{

    private  boolean closed;

    private static final Cleaner CLEANER = Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    private final ResourceCleaner resourceCleaner;

    public SampleResource() {
        this.resourceCleaner = new ResourceCleaner();
        this.cleanable = CLEANER.register(this,resourceCleaner);
    }
    // 별도의 Thread로 Cleaning.
    private static class ResourceCleaner implements Runnable {
        //SampleResource 자원을 주면 안됀다.
        @Override
        public void run() {
            System.out.println("Clean");
        }
    }

    @Override
    public void close() throws RuntimeException {
        if(this.closed) {
            throw new IllegalStateException();
        }
        closed=true;
        cleanable.clean();
    }
    public void test() {
        System.out.println("test");
    }
}
