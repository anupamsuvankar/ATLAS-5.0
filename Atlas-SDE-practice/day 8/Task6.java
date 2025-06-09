class Student1 {
    public String name;

    Student1(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Task6 {
    public static void main(String[] args) {

        Student1[] myStudents = {
                new Student1("Dharma"),
                new Student1("sanvi"),
                new Student1("Rupa"),
                new Student1("Ajay")
        };
        for (Student1 m : myStudents) {
            System.out.println(m);
        }
    }
}
