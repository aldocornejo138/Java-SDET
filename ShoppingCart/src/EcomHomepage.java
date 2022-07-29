import java.util.Scanner;

public class EcomHomepage {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in); //Standard input system
			
			//Visual 
			System.out.println("                 SHOPPING CART ASSIGNMENT   ");
			System.out.println("=======================++++++++++++++===========================");
			System.out.println();
			System.out.println("Hello, Welcome to SHOPPINGCART. Whats your name?");
			String name= sc.nextLine(); // reads the string
			
			ShoppingCart ShoppingCart = new ShoppingCart(name); // creates an instance of Shopping Cart
			
			
			//Options for User to do
			System.out.println("If you'd like to... ");
			System.out.println();
			System.out.println("1. Add a Product - type 1.");
			System.out.println("2. Delete a Product - type 2.");
			System.out.println("3. Show SubTotal Balance - type 3.");
			System.out.println("4. Exit out of Program - type 4.");
			
			//Do while loop for User to use endlessly
			do 
			{
				int num = sc.nextInt(); //user inputs number 1-4
				System.out.println();
			
			   	switch(num) 
			      {
			          //switch method to switch from actions
			         case 1: 
			        	    
			        	    ShoppingCart.addProduct(); // adds a product
			              
			        	    break;
				
			          case 2: 
				
			         	    ShoppingCart.deleteProduct(); // deletes a product
			        	    break;
				
			          case 3: 
				
			        	    ShoppingCart.Display(); // Displays the Product
			        	    break;
			
			          case 4: 
			        	    
			        	    System.out.println("Thank You for Shopping with us. Have a Good Day!"); //says farewell to customer
			        	    return;
			        }
			   	
			} while(!sc.equals("4")); //if user inputs exit or 4, get out of loop
			
			
		}

	}


