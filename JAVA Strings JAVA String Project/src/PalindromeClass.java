import java.util.Scanner;


//Question Number 2. Create Palindrome class in JAVA and then do the following:
//Ask User to enter a word or create a String variable and assign a word to it
//Reverse a String and check if string in Palindrome

public class PalindromeClass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //Standard input system
		System.out.print("Enter a String: "); //user inputs string
		String string= sc.nextLine(); // reads the string
		System.out.print("You have entered: " + string + "\n"); // prints string
		
		String forward = string.toLowerCase(); //Sets all letters to lowercase
		
		String reverse = ""; // reversed string
		
		// for loop that reverses the string and stores it
		for ( int i= forward.length() - 1; i >= 0; i--) 
		{
			reverse = reverse + forward.charAt(i);
		}
		

		//checks if both strings are equal 
		if (forward.equals(reverse))
		{
			System.out.print("String is a Palindrome"); 
		}
		
		else 
		{
			System.out.print("String is not a Palindrome");
		}
		

	}

}
