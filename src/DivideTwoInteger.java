
public class DivideTwoInteger {

	public static void main(String[] args) {
		System.out.println(divide(-100,10));
	}
	public static int divide(int dividend , int divisor) {
		int result = 0; 
		long number = 0;
		int sigh = 0;

		long dividendSec = Math.abs((long)dividend);
		long divisorSec = Math.abs((long)divisor);
		System.out.println(dividendSec);
		System.out.println(divisorSec);
		
		while((number= number + divisorSec)<=dividendSec) {
			
			result++;
		}
		// if one of the number is negative return negative result
		// other wise return postive result
		if((dividend < 0  && divisor < 0) || (dividend > 0 && divisor >0)) {
			return result;
		} else return (-1)*result;
		

	}

}
