
public class ReverseInteger {
	
    public int reverse(int x) {
    	
    	//check the integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
    	//reverse number by getting the last number of x
    	//declaring the reverse number as long value to check if it is out of bound of the Integer

    	long reverseNumber=0;
    	while(x!=0) {
			reverseNumber = (reverseNumber * 10) + (x%10);

			
			x = x / 10;
		}
    	if(reverseNumber < Integer.MIN_VALUE || reverseNumber > Integer.MAX_VALUE) {
    		return 0;
    	}
    	//return casting reverse number to int since we declare it long; 
    	return (int)reverseNumber;
        
    }
}