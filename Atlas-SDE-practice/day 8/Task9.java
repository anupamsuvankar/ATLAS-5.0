public class Task9 {
    public static void main(String args[]) {
        int arr[][] = { { 22, 87, 19 }, { 53, 66, 21 }, { 57, 44, 92 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}
