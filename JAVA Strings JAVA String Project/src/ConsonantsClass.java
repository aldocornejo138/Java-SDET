import java.util.Scanner;

//4. Create Consonants class in JAVA and then do the following:
//- Ask User to enter a sentence or create a String variable to assign a sentence to it
//- Count all consonants in a String and display the count
//- Replace all consonants with '*' in a String

public class ConsonantsClass {

	public static void main(String[] args) {
		
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
			if (string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' && string.charAt(i) != 'o' && string.charAt(i) != 'u' && string.charAt(i) != ' ')
			{
				
				string = string.replace(string.charAt(i), '*');
				count++; //increments count by 1
				
			}
		}
				
		System.out.print("The Number of Consonants in the String: " + count + "\n"); // prints out count 
		System.out.print("New String: " + string);

	}

}
