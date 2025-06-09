public class Task17 {

    void add(int x, int y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(int x, int y, int z) {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public static void main(String[] args) {
        Task17 obj = new Task17();

        obj.add(10, 20, 30);
        obj.add(50, 100);
    }
}
