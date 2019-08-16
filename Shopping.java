package JavaAssesment;

import java.util.HashMap;
import java.util.Scanner;

/*Question 2: Design an E-Commerce cart to demonstrate the oops concept as a whole.
Instructions:
i) Your code must contain 3 entities i.e. Customers, Products, and Orders
ii) Your code should be command-line driven and should not exit unless the user opts to.
Workflow Example:
1. Register a Customer
2. Create a Product
3. Create an Order
i) A customer needs to log in with valid credentials.
ii) Display the list of products with their name and price
iii) A customer can select multiple products in his cart
iv) Perform checkout (Calculate the total amount and collect the delivery details)
4. View orders
5. Exit
*/
public class Shopping {
	Scanner sc = new Scanner(System.in);
	public void customers() {
		
		HashMap <Integer,String> customers = new HashMap<Integer,String>();
		int id = sc.nextInt();
		String name = sc.nextLine(); 
		customers.put(id,name);
}
	public void products() {
		
		HashMap <Integer,String> proList = new HashMap<Integer,String>();
		int proid = sc.nextInt();
		String proname = sc.nextLine(); 
		proList.put(proid,proname);
	}
	
	public void orders() {
		
	
		
	}
	
	public void checkOut() {
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		System.out.println("1. Register a Customer");
		System.out.println("2. Create a Product");
		System.out.println("3. Create an Order");
		System.out.println("4. View orders");
		System.out.println("5. Exit");
		Shopping sh = new Shopping();
		Scanner sc = new Scanner(System.in);
		
	for(int x =0;;x++) {
		int choice = sc.nextInt();
		switch(choice)
	     {
	     case 1:
	      sh.customers();
		case 2:
		  sh.products();
		case 3:
		  sh.orders();
		case 4:
		  sh.checkOut();
		case 5:
			 
	     }
	}
	
		
	}
}
