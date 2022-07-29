import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	

		Scanner scanner= new Scanner(System.in); //Standard input system
		
		//Visual 
		System.out.println("                  BANK TRANSACTION ASSIGNMENT   ");
		System.out.println("=======================++++++++++++++===========================");
		System.out.println();
		System.out.println("Hello, Welcome to BANKTRANSACTION.");
		
		BankAccount BankAccount = new BankAccount(); 
		
		//Options for User to do
				System.out.println("If you'd like to... ");
				System.out.println();
				System.out.println("1. Show Account Balance- type 1.");
				System.out.println("2. Deposit Funds- type 2.");
				System.out.println("3. Withdraw Funds- type 3.");
				System.out.println("4. Display Transactions - type 4.");
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
				        	    
				        	    BankAccount.DisplayAccountBalance(); // Displays account Balance
				              
				        	    break;
					
				          case 2: 
					
				         	    BankAccount.Deposit(); // deposits funds into account
				         	  
				        	    break;
					
				          case 3: 
					
				        	    BankAccount.Withdraw(); // Withdraws from account
				        	    break;
				
				          case 4: 
				        	  
				        	  	BankAccount.DisplayTransactions(); // displays all transactions
				        	  	
				        	  	break;
				        	  	
				          case 5: 
				        	    
				        	    System.out.println("Thank You for Banking with BankTransactions. Have a Good Day!"); //says farewell to customer
				        	    return;
				        }
				   	
				} while(!scanner.equals("5")); //if user inputs exit or 5, get out of loop
				
				
				
				
			}
	}

