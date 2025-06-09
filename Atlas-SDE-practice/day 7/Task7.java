
class Customer{
 	void create() {
		System.out.println("New Customer Created");
	}

	void display(){
		System.out.println("Existing Customer");
    }
}

public class Task7{
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.create();
		customer.display();
	}
}
