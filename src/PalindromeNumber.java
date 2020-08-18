
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		
		//Reversing the number 
		//checking if the reverse number equal to the input
		//then print out solution
		
		// if the number if negative return false;
		
		if(x < 0) {
			return false;
		}
		
		int reverseNumber=0;
		int cloneX = x;
    	while(x!=0) {
			reverseNumber = (reverseNumber * 10) + (x%10);

			
			x = x / 10;
		}
    	// if the Palindrome number it will have the same value if we reverse the position of the number.
    	if(reverseNumber == cloneX) {
    		return true;
    	}
    	
    	return false;
    	//return casting reverse number to int since we declare it long; 
	}
}
