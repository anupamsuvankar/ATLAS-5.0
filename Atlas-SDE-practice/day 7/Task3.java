public class Task3 {
 public static void main(String[] args) {
    int a=2;
    int b=5;

    System.out.println("initial values: a = " + a + " and  b = "+ b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Final values: a = " + a + " and  b = "+ b);

 }   
}
