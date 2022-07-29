import java.util.Scanner;

//Question #3. Create Words class in JAVA and then do the following:
//- Ask User to enter a sentence or create a String variable to assign a sentence to it
//- Count all Words in a String and display the count
//- Display the count of word in a sentence

public class WordsClass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //Standard input system
		System.out.print("Enter a String: "); //user inputs string
		String string= sc.nextLine(); // reads the string
		System.out.print("You have entered: " + string + "\n"); // prints string
		
		int count = 0; // sets count to 0
		
		//for loop where all words in sentence are counted
		for ( int i =0; i < string.length(); i++) 
		{
			if(string.charAt(i) == ' ')
			{
				count++; 
			}
		}
		
		count= count + 1; //adds the last word
		System.out.print("Count of Words in String: " + count);
	}

}
