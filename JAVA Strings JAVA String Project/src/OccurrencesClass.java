import java.util.Arrays;
import java.util.Scanner;

//Create Occurrences class in JAVA and then do the following:  
//- Write a function that counts the number of occurrences for each integer in an int array.
//Array Input: {10, 10, 5, 12, 3, 5};
//Output: {10: 2, 5:2, 12:1, 3:1}

public class OccurrencesClass {

	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
    
	//creates array with these inputs
	int arr[] = {10, 10, 5, 12, 3 , 5}; 
	int n = arr.length;	
	
	//new array seen and all are set to false
	boolean seen[] = new boolean[n];
	Arrays.fill(seen, false);
	
	//for loop where add to new array and if an occurrence we increment by 1
	for(int i = 0; i < n; i++)
	{
		if (seen[i] ==true)
			continue;
		
		int count = 1;
		
		//increment by 1 seen array already has the element
		for (int j = i + 1; j < n; j++) 
		{
            if (arr[i] == arr[j])
            {
                seen[j] = true;
                count++;  
            }
        }
	
		
	System.out.print("Number of Occurences for " + arr[i] + ": " + count + "\n");
	
	}
	
	}
}

