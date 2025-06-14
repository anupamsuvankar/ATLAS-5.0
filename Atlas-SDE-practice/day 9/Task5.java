public class Task5 {

    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            int b = 2;
            int c = 1 / b;
            a[0] = c;
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block 1");
            System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
        } catch (Exception e) {
            System.out.println("Catch block 2");
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
