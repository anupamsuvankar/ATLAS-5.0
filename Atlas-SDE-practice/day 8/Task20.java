class Employee {
    private int pwd;
    protected int salary;
    public int empid;

    Employee(int pwd, int salary, int empid) {
        this.pwd = pwd;
        this.salary = salary;
        this.empid = empid;
    }

    public int getPwd() {
        return pwd;
    }
}

class Task20 extends Employee {

    Task20(int pwd, int salary, int empid) {
        super(pwd, salary, empid);
    }

    public static void main(String[] args) {
        Task20 obj = new Task20(1254, 50000, 10001);

        System.out.println("Password: " + obj.getPwd());
        System.out.println("Salary: " + obj.salary);
        System.out.println("EmpID: " + obj.empid);
    }
}
