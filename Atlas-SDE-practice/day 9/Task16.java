public class OuterClass2 {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }

    public int getSum() {
        InnerClass inner = new InnerClass();
        return x + inner.y;
    }
}

public class Task16 {
    public static void main(String[] args) {
        OuterClass2 myOuter = new OuterClass2();
        System.out.println(myOuter.getSum());
        // OuterClass.InnerClass myInner = myOuter.new InnerClass();
        // OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        // System.out.println(myInner.y + myOuter.x);

    }
}