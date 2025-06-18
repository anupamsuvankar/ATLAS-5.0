class Counter4 {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    //	Static synchronized: since its a static method, its gets locked with the obj instead of instance. thats why only one thread can access it

    public static int getCount() {
        return count;
    }
}

class ThreadDemo4 extends Thread {
    Counter4 counter;

    ThreadDemo4(Counter4 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        Counter4 counter2 = new Counter4();
        ThreadDemo4 t1 = new ThreadDemo4(counter2);
        ThreadDemo4 t2 = new ThreadDemo4(counter2);

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
