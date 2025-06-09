class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:" + z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:" + z);
    }
}

class Clock {
    public void time() {
        System.out.println("Todays time");
    }
}

public class Task15 extends Calculation, Clock {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:" + z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        Task14 demo = new Task14();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}
