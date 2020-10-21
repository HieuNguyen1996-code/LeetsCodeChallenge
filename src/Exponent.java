
public class Exponent {

	public static void main(String[] args) {
		xMethod(5);

	}
	public static int exponential(int nums, int exponent) { 
		if(exponent ==0) return 1;
		else return nums*(exponential(nums,exponent-1));

	}
	
	public static int sums (int nums) { 
		if(nums != 0) return nums+sums(nums-1);
		else return 0;
	}
	public static void xMethod(int n) {
		if (n > 0) {
		xMethod(n - 1); 
		System.out.print(n + " ");
		}
	}

}
