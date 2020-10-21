
public class FindingPowerOfTwo {
	public static void main(String[] agrs) { 
		System.out.println(powerOfTwo(4));
	}
	public static int powerOfTwo(int nums) { 
		if(nums == 0) return 1; 
		else return 2*powerOfTwo(nums-1);
	}

}
