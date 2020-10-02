import java.util.Arrays;

public class RemoveElement {
	public static void main (String[] args ) {
		int[] nums = {
				0,1,2,2,3,0,4,2
				// 0 0 1 3 4 2 2 2
		};
		System.out.println(removeElement(nums, 2));
		
	}
	public static int removeElement(int[] nums, int val) { 
		Arrays.sort(nums);
		int result =0; 
		int start =0;
		int end = nums.length-1; 		
		int count =0;
		while(count < nums.length) { 
			if(nums[count] == val) { 
				nums[count] = nums[end-result];
				
				result++; 
			}
			
			
			count++; 
		}
		result = nums.length - result;
		
		return result;
	}

}

