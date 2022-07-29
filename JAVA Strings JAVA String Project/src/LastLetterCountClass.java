import java.util.Scanner;

//5. Create LastLetterCount class in JAVA and then do the following:
//- Ask User to enter a sentence or create a String variable to assign a sentence to it
//- Count all words that ends in 's' in a String and words that ends in 'y' in a String
//- Switch the first instance of word that end with 's' and 'y'
//- Display the new sentence where words are switched

public class LastLetterCountClass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //Standard input system
		System.out.print("Enter a String: "); //user inputs string
		String string= sc.nextLine(); // reads the string
		System.out.print("You have entered: " + string + "\n"); // prints string
		string = string.toLowerCase(); //sets sentence to lowercase
		

		int scount = 0; // count for s
		
		int ycount =0; // count for y
				
		
         // for loop to count all the occurrences of s
		 for (int i = 0; i < string.length() - 1; i++) 
			 
		 {
	            if ((string.charAt(i) == 's' && !Character.isLetter(string.charAt(i + 1))))
	            {
	                scount++;
	            }
	     }
	          
         // for loop to count all the occurrences of y
		 for (int i = 0; i < string.length() - 1; i++) 
			 
		 {
	            if ((string.charAt(i) == 'y' && !Character.isLetter(string.charAt(i + 1))))
	            {
	                ycount++;
	            }
	     }
		 
		 
		System.out.print("Number of all words that end in 's': " + scount + "\n");
		System.out.print("Number of all words that end in 'y': " + ycount + "\n");
		
		String array[] = string.split(" ");
		String temp[] = new String[array.length];
		temp = array;
		
		for( int i=0 ; i < array.length - 1 ; i++)
		{
			String str = array[i];
			
			for( int j=0; j < str.length(); j++)
			{
				if ((str.charAt(j) == 's' && !Character.isLetter(string.charAt(j + 1)) || str.charAt(j) == 'y' && !Character.isLetter(string.charAt(j + 1))))
				{
					temp[i] = null;
				}
				
			}
			
		}
		
			for( int k =0; k < temp.length; k++)
			{
			System.out.print(temp[k] + " ");
			}
	
			
		}
		
	}
