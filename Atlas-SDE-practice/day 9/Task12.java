import java.util.ArrayList;

class Task12 {
    public static void main(String args[]){
      
        ArrayList<String> al = new ArrayList<>();
      
        al.add("Anupam");
        al.add("Suvankar");

      	System.out.println("Orignal List : "+al);
    
        al.add(1, "Hello");
      	System.out.println("After Adding element at index 1 : "+ al);
      	
      	al.remove(0);      
      	System.out.println("Element removed from index 0 : "+ al);
      	
      	al.remove("Anupam");      
      	System.out.println("Element Anupam removed : "+ al);
      
       	al.set(0, "K");
        System.out.println("List after updation of value : "+al);;

        al.add("5");
    }
}
