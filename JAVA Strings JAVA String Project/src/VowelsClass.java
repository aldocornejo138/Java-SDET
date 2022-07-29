import java.util.Scanner;


// Question Number 1:
//Create Vowels class in JAVA then do the following:
//- Ask User to enter a sentence or create a String variable to assign a sentence to it
//- Count all the vowels in a sentence and display the count

public class VowelsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in); //Standard input system
		System.out.print("Enter a String: "); //user inputs string
		String string= sc.nextLine(); // reads the string
		System.out.print("You have entered: " + string + "\n"); // prints string
		string = string.toLowerCase(); //sets sentence to lowercase
		
		
		//Checks if string contains vowels and counts them
		int count =0; // sets count to 0
		
		//for loop to to see if string contains a vowel
		for (int i=0; i < string.length(); i++)
		{
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
			{
				count++; // increments count by 1
			}
		}
				
		System.out.print("The Number of Vowels in the String: " + count); // prints out count 
		
	}

}
