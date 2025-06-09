public class Task18 {
    void add(int x, int y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(char x, char y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    void add(int x, int y, int z) {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public static void main(String[] args) {
        Task18 obj = new Task18();

        obj.add('a', 'b');
        obj.add(100, 100);

    }
}
