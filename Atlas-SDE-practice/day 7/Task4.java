public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println("a = "+a+", b = "+b);
        System.out.println("Sum = " + sum(a, b));
        System.out.println("Difference = "+ diff(a, b));
        System.out.println("Multiplication = "+ multiply(a, b));
        System.out.println("Division = "+ division(a, b));

    }

    private static int division(int a, int b) {
        return b/a;
    }

    private static int multiply(int a, int b) {
        return a*b;
    }

    private static int diff(int a, int b) {
        return b-a;
    }

    private static int sum(int i, int j) {
        return i + j;
    }
}
