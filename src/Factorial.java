
public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(0));
	}

	public static int factorial(int nums) { 
	
		if(nums==0) return 1;
		else return nums*factorial(nums-1);

	}
}
