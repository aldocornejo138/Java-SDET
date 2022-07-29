package jdbcAssigment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in); //Standard input system
		
		//Visual 
				System.out.println("                  JAVA JDBC Assignment  ");
				System.out.println("=======================++++++++++++++===========================");
				System.out.println();
				System.out.println("Hello, Welcome to the Products Database.");
				
				
				Products Products = new Products();
		
				//Options for User to do
				System.out.println("If you'd like to... ");
				System.out.println();
				System.out.println("1. Add a Product- type 1.");
				System.out.println("2. Read from the Database- type 2.");
				System.out.println("3. Update Products from the Database- type 3.");
				System.out.println("4. Delete Items from the Database - type 4.");
				System.out.println("5. Exit out of the Program - type 5.");
				
				//Do while loop for User to use endlessly
				do 
				{
					int num = scanner.nextInt(); //user inputs number 1-4
					System.out.println();
				
				   	switch(num) 
				      {
				          //switch method to switch from actions
				         case 1: 
				        	    
				        	    Products.Add(); // adds to the database
				              
				        	    break;
					
				          case 2: 
					
				         	    Products.Read(); // reads off of the database
				         	  
				        	    break;
					
				          case 3: 
					
				        	    Products.Update(); // updates the database
				        	    break;
				
				          case 4: 
				        	  
				        	  	Products.Delete(); // deletes from the database
				        	  	
				        	  	break;
				        	  	
				          case 5: 
				        	    
				        	    System.out.println("Thank You for using the Products Database. Have a Good Day!"); //says farewell to customer
				        	    return;
				        }
				   	
				} while(!scanner.equals("5")); //if user inputs exit or 5, get out of loop
				

	}

}
