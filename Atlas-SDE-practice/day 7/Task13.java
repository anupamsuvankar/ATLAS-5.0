public class Task13 {
    public static void main(String[] args) {
        for(int i = 10; i >=0; i--){
            if (i == 5 || i == 7) {
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
