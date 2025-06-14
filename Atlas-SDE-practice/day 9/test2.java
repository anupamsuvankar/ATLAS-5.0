interface interface1 {
    void show();

    void hide();
}

interface interface2 {
    int add(int a, int b);

    int mul(int a, int b);
}

class Document {
    int a;
    int b;
}

class Doc extends Document implements interface1, interface2 {

    Doc() {
        a = 25;
        b = 26;
    }

    @Override
    public void show() {
        System.out.println("Show metnod called");
    }

    @Override
    public void hide() {
        System.out.println("Hide metnod called");

    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }
}

public class test2 {
    public static void main(String[] args) {
        Doc d = new Doc();
        System.out.println(d.a);
        System.out.println(d.b);
        d.show();
        d.hide();
        System.out.println(d.add(5, 6));
        System.out.println(d.mul(8, 6));
    }
}
