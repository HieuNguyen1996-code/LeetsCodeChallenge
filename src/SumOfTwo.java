import java.util.Arrays;

public class SumOfTwo {

	public static void main(String[] args) {
		int[] setNumbers = {1, -2, 1, 0, 5};
		int target = 0;
		
		System.out.println(sum(setNumbers,target));

	}
	public static boolean sum(int[] setNumbers, int target) {	
		if(setNumbers.length ==0 || setNumbers == null) {
			return false;
		}
		Arrays.sort(setNumbers);
		int[] result = new int[2];
		int start = 0;
		int end = setNumbers.length -1;
		int sum =0;
		while(start < end) {
			sum = setNumbers[start] + setNumbers[end];
			if(sum > target) {
				end--;
			} else if(sum < target) {
				start++;
			} else {
				result[0] = start;
				result[1] = end;
				System.out.println(result[0] + " " + result[1]);
				return true;
			}
			sum = 0;
			}
		return false;
	}
}
