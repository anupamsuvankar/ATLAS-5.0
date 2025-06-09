public class Task2 {
    public static void main(String[] args) {
        char[] Name = {'A', 'n', 'u', 'p', 'a', 'm'};

        System.out.println(Name);

        int n = Name.length;

        System.out.println("There are " + n + " letters in my name.");

        System.out.println("Letters in my name:");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
    }
}
