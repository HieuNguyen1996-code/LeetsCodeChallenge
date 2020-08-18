
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		
		//convert x to a String 
		//check to see if it is Palindrome
		//PalindromeNumber is the number that switch
		//the beginning with the end and get the same result
		//Since the negative number does not have Palindrome
		//We will assume there is no negative Palindrome number
		
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
