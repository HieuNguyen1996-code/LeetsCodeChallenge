
public class PowerOperation {
	public static double pow(double x, long n) {

		 if(n==0) {
			 return 1.0;
			 
		 }
		 if(n==1) return x;

		 if( n< 0) return pow(1/x, -n); 
		 
		double result = pow(x*x, n/2);
		 if(n%2 ==1) 
			 return result*x;
		 return result;
	 }
	
	public static double myPow(double x, int n) {
	    long newN = (long) n;
	    System.out.println(newN);
		return pow(x,newN);
		
		
	}
	 
	 
	public static void main(String[] args) {
		System.out.println(pow(2, 3));
	}
	
	
}