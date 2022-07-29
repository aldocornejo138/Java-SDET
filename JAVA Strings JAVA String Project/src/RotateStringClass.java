import java.util.Scanner;

//6. Create RotateString class in JAVA and then do the following:
//- Ask User to enter a word or create a String variable and assign a word to it
//- Write a function that rotates the letters of a string to the number of places mentioned:
//For example:
//String = Apple
//Count = 2
//Output = pleAp

public class RotateStringClass {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in); //Standard input system
		System.out.print("Enter a String: "); //user inputs string
		String string= sc.nextLine(); // reads the string
		System.out.print("You have entered: " + string + "\n"); // prints string
		System.out.print("How many times would you like to rotate? ");
		int n = sc.nextInt();
		string = string.toLowerCase(); //sets sentence to lowercase
		
		
        //rotates the string using substring
		String rotate = string.substring(n) + string.substring(0, n);
		
		System.out.print(rotate);
		
	}

}
