package Day2.Classroom.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		Arrays.sort(data);	
		
				
		System.out.println(data[data.length-1]);
		
		
				
		
		// Print the second largest number	
		System.out.println("Second largest number:" +data[data.length-2]);
		
		
	
	}

}
