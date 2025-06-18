import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter5 {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
        // manually lock the method
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo5 extends Thread {
    Counter5 counter;

    ThreadDemo5(Counter5 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        Counter5 counter2 = new Counter5();
        ThreadDemo5 t1 = new ThreadDemo5(counter2);
        ThreadDemo5 t2 = new ThreadDemo5(counter2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter2.getCount());
    }
}

