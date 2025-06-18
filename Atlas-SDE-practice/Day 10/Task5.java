class Counter2 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }
    //Synchronized method: the method is sycned so one thread can only enter the method ar a time on the same obj.

    public int getCount() {
        return count;
    }
}

class ThreadDemo2 extends Thread {
    Counter2 counter;

    ThreadDemo2(Counter2 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        Counter2 counter2 = new Counter2();
        ThreadDemo2 t1 = new ThreadDemo2(counter2);
        ThreadDemo2 t2 = new ThreadDemo2(counter2);

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
