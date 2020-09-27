
import java.util.Arrays;
public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = {
				0,0,1,1,1,2,2,3,3,4
		};
		
		System.out.println(removeDuplicates(nums));

	}
	
	public static int removeDuplicates(int[] nums) { 
		int result = 0; 
		
		int count = 0;
		int start = 0;
		Arrays.sort(nums);
		while (start < nums.length-1) { 
			start++; 
			if(nums[count]!= nums[start]) {
				result += 1; 
				count = start;
				
				nums[result] = nums[count];
			}
		}
	
		return result+1;
	}

}
