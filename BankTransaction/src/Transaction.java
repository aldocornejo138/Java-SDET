import java.util.ArrayList ;
public class Transaction{
	
	//Attributes 
	private int transactionCount;
	private String entryType;
	private double amountDepositWithdraw;
	private double totalBalance;


	//constructor for the Transaction class 
	public Transaction() {
		
		transactionCount = 0;
		entryType = " " ;
		totalBalance = 0.0;
		amountDepositWithdraw = 0.0;
	}
	
	//function that adds a new entry into array 
	public void addEntry(int TransactionCount, String EntryType, double AmountDepositWithdraw, double TotalBalance) {
		
		transactionCount = TransactionCount;
		entryType = EntryType;
		amountDepositWithdraw = AmountDepositWithdraw;
		totalBalance = TotalBalance; 
		
	}
	
	//Function that displays all the contents in the array
	public void Display() {
		
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("Transaction Number: " + transactionCount);
		System.out.println("Entry Type: " + entryType);
		
		//depending on what entrytype it is
		if (entryType == "Deposit")
		{
			System.out.println("Deposited $500!!");
		}
	    
		else if( entryType == "Withdraw") 
		{
			System.out.println("Withdrew $500!!");
		}
		
		System.out.println();
		System.out.printf("TOTAL BALANCE: $%.2f \n", totalBalance);
		System.out.println("------------------------------------------------");
	}
	

}
