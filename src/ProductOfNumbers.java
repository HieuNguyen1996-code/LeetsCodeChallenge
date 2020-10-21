
public class ProductOfNumbers {
	public static void main (String[] args) { 
		int[] nums = {
				0,0
		};
		
		int[] newNums = product(nums);
		for(int i: newNums) { 
			System.out.println(i);
		}
		
		
		
	}
	
	public static int[] product(int[] nums) {
		if(nums.length ==0) return null;

		int[] result = new int[nums.length];
		int production =1;
		int totalProduct = 0;
		int track =0;
		boolean isZero = false;
		
		
		return result;
	}
}
