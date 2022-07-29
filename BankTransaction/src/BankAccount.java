import java.util.ArrayList ;
public class BankAccount {

	//Private Attributes 
	private int accountNumber = 21817832;
	private double balance = 50; 
	private String customerName= "Aldo Cornejo";
	private String emailAddress = "aldocornejo138@yahoo.com";
	private String phoneNumber = "951-795-3173";
	
	private Transaction[] accountTransaction; //array for the transactions
	
	private final int MAX_TRANSACTIONS = 100; //MAX amount of transactions
	
	private int transactionCount; 
	
	//Constructor
	public BankAccount() {
		
		/*
		accountNumber= AccountNumber;
		balance = Balance;
		customerName= CustomerName;
		emailAddress= EmailAddress;
		phoneNumber= PhoneNumber;
		*/
		callTransaction();
		
	}
	
	
	
	//SETTERS AND GETTERS
	
	//Gets the customers name
	public String getCustomerName()
	{
		return customerName;
	}
	
	//sets the customers name
	public void setCustomerName(String name) {
		
		//this.customerName = customerName;
	}
	
	//gets account Number
	public int getAccountNumber() {
		
		return accountNumber;
	}
	
	//Sets accountnumber
	public void setAccountNumber( String accountNumber) {
		
		//this.accountNumber = accountNumber;
		
	}
	
	//gets Balance 
	public double getBalance() {
		
		return balance;
	}
	
	//Sets the Balance
	public void setBalance(double Balance) {
		
		this.balance = Balance;
		
	}
	
	//gets the Email Address
	public String getEmailAddress()
	{
		return emailAddress;
	}
	//gets the Phone Number
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	//gets TrabsactionCount
	public int getTransactionCount()
	{
		return transactionCount;
	}
	
	
	
	//METHODS
	
	//Function calls the Transaction class and creates and an array
	public void callTransaction(){
		
		accountTransaction= new Transaction[MAX_TRANSACTIONS]; 
		
		// adds the transaction to array
		accountTransaction[transactionCount] = new Transaction();
		accountTransaction[transactionCount].addEntry( transactionCount, "Account Created!!" , balance, balance);
		transactionCount +=1;
		
	}
	
	//Function Deposits funds into account 
	public void Deposit() {
		
		System.out.println("Deposited New Funds Into Balance!!");
		System.out.println("-------------------------------------------");
		balance = balance + 500;
		System.out.println("Total Balance: $" + this.getBalance() + "0");
		System.out.println();
		
		//Saves the transaction by creating a new entry
		accountTransaction[transactionCount]= new Transaction(); 
		accountTransaction[transactionCount].addEntry(transactionCount, "Deposit", 500, balance);
	    transactionCount +=1;
	    
	}
	
	//Function Withdraws from Account
	public void Withdraw() {
		
		//if balance is 0 don't withdraw
		if (balance != 0) {
		
		System.out.println("Withdrew Funds From Balance!!");
		System.out.println("-------------------------------------------");
		balance = balance - 500;
		System.out.println("Total Balance: $" + this.getBalance() + "0");
		System.out.println();
		
		//Saves the Transaction by creating a new Array
		accountTransaction[transactionCount]= new Transaction();
		accountTransaction[transactionCount].addEntry(transactionCount,"Withdraw", 500, balance);
		transactionCount +=1;
		}
		
		//if not enough funds in account
		else {
			
			System.out.println("Not Enough Funds in Account!!");
			System.out.println("Total Balance: $" + this.getBalance() + "0");
		}
		
	}
	
	//Function displays the account balance by calling all the getter functions
	public void DisplayAccountBalance(){
		
		System.out.println("                 ACCOUNT BALANCE");
		System.out.println("------------------------------------------------------");
  	    System.out.println(); 
  	    System.out.println("Account Number: " + this.getAccountNumber());
  	    System.out.println("Customer Name: " + this.getCustomerName());
  	    System.out.println("Balance: $" + this.getBalance() + "0");
  	    System.out.println("Email: " + this.getEmailAddress());
  	    System.out.println("Phone Number: " + this.getPhoneNumber());
  	    System.out.println();
 
		
	}
	
	//Function Displays all the Transactions by calling the array accountTransaction
	public void DisplayTransactions() {
		
		System.out.println();
		System.out.println("Account Name: " + getCustomerName());
		System.out.println("Account Number: "+ getAccountNumber());
		System.out.println("============================================");
		
		//for loop used to call display method in Transaction class
		for ( int i =0; i< transactionCount; i++)
		{
			accountTransaction[i].Display();
			
		}
		
		System.out.println("=============================================");
		
		
	}
	
	
	
	
	
	
	
	
}
