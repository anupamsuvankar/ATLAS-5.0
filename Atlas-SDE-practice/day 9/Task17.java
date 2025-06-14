class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class Task17 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        // OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}