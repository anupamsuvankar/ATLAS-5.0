import java.util.ArrayList;

public class Task11 {
    public static void main(String[] args) {
        testArreyList t = new testArreyList();
        t.displayNumbers(15);
    }
}

class testArreyList{
    public void displayNumbers(int target) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= target; i++) {
            numbers.add(i);
        }

        System.out.println("ArrayList elements:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}