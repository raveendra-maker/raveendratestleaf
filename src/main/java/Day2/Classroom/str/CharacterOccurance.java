package Day2.Classroom.str;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 't';
		int totalCount = 0;
		
		test.charAt(test.indexOf('t'));
		System.out.println(test.indexOf('t'));
		
		
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/
		
		char[] arr = test.toCharArray();
		int length=arr.length;
		for (int i = 0; i < arr.length-1; i++) {
			
			if(ch==arr[i])
			{
				totalCount++;
			}
			
		}
		
		

		
		
		
		
		
		
		
		
		
		// Print the count here
		System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}
