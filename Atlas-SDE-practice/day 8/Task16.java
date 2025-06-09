class Customer {
    int cost = 40;
    String items = "Tomatoes";
}

public class Task16 extends Customer {

    int cost = 30;
    String items = "Onions";

    public static void main(String[] args) {
        Task16 obj = new Task16();

        obj.items = "Potatoes";
        obj.cost = 50;

        System.out.println(obj.items);
        System.out.println(obj.cost);

        System.out.println("%%%%%%%%%%%%%%");

        obj.printParentDetails();
    }

    void printParentDetails() {
        System.out.println(super.items);
        System.out.println(super.cost);
    }
}
