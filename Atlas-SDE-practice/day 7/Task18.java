public class Task18 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.setName("Anupam");
        System.out.println(p.getName());
  }
}

class Person2 {
   private String name;

   public String getName() {
        return name;
   }

    public void setName(String newName) {
        this.name = newName;
   }
}
