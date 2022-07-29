import java.util.Scanner;


//8. Create TraverseString Class in JAVA and then do the following:
//- Ask User to enter a sentence or create a String variable to assign a sentence to it
//Traverse through a string and only output the unique characters.
//For example:
//Input: “racecar”
//Output: “race”
public class TraverseStringClass {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in); //Standard input system
		System.out.print("Enter a String: "); //user inputs string
		String string= sc.nextLine(); // reads the string
		System.out.print("You have entered: " + string + "\n"); // prints string
	
		//for loop to compare the string and check for uniqueness
		 for (int i = 0; i < string.length(); i++)
		    {
		        int flag = 0;
		        for (int j = 0; j < string.length(); j++)
		        {
		            // checking if two characters are equal
		            if (string.charAt(i) == string.charAt(j) && i != j)
		            {
		                flag = 1;
		                System.out.print(string.charAt(i));
		            }
		            //if( string.charAt(i)==
		        }
		        if (flag == 0)
		        {
		        	System.out.print(string.charAt(i));
		             break; 
		        }
		    }
	}
}