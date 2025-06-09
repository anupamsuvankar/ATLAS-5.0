public class Task17 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        System.out.println(p.name);
  }
}

class Person {
   private String name;

   public String getName() {
        return name;
   }

    public void setName(String newName) {
        this.name = newName;
   }
}
