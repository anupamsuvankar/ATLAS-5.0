public class Task19 {
    void add(int x, int y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(char x, char y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(int x, int y, int z) {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    void add(int x, float y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(float x, int y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        Task19 obj = new Task19();

        obj.add(10, 2.5f);
        obj.add(10.5f, 25);

    }
}
