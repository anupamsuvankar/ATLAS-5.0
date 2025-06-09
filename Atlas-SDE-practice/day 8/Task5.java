public class Task5 {
    public static void main(String[] args) {
        Student[] arr = new Student[5];;

        arr[0] = new Student(1, "anupam");
        arr[1] = new Student(2, "suvankar");
        arr[2] = new Student(3, "anupam suvankar");
        arr[3] = new Student(4, "Ashish");
        arr[4] = new Student(5, "nirupama");

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                    + arr[i].roll_no + " "
                    + arr[i].name + " }");
    }
}

class Student {
    public int roll_no;
    public String name;

    Student(int Roll_no, String Name) {
        this.roll_no = Roll_no;
        this.name = Name;
    }
}
