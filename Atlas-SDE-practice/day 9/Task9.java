public class Task9 {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            fun();

        } catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
    }
}
