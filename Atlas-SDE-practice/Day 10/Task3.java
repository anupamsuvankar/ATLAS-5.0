public class Task3 {
    public static void main(String args[]) {
        RunnableDemo2 R1 = new RunnableDemo2("Thread-1");
        R1.start();

        RunnableDemo2 R2 = new RunnableDemo2("Thread-2");
        R2.start();
    }
}

class RunnableDemo2 extends Thread {
    private String threadName;

    RunnableDemo2(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        super.start();
    }
}
