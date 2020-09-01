import java.util.Arrays;

public class searchRange {
	public static int[] searchRangeNumber(int[] nums, int target) {
//		int[] wrong = {-1,-1};
		int start = 0;
		int end = nums.length-1;
		int mid = (nums.length-1)/2;
		//checking if the nums has numbers
		
		while(nums[end] != nums[start] ) {
			if(nums[end] > target) {
				end--;
			} else if(nums[start] < target ) {
				start++;
			}
			System.out.println("start: " +start+" end: " + end );
		}
		int[] result = new int[end-start];
		
		for(int i=0; i < result.length; i++) {
			result[i] = i+1;
		}
		return result;
	}
	public static int[] searchRangeNumber2(int[] nums, int target) {
		int end = nums.length -1;
		int count =0;
		int store=0;
		int[] indexSolution = new int[nums.length];
		while(nums[count] != target || nums[end] != target) {
			if(nums[count] != target) {
				count++;
			
			}
			if(nums[end] != target) {
				end--;
			}
		}
		
		
		
		
		return nums;
	}

	public static void main(String[] args) {
		int[] numbers = {5,7,7,8,8,8,8,8,8,8,8,8,8,8,8,10};
		System.out.println(searchRangeNumber2(numbers,8));
	}

}
