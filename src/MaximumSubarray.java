
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}
	
	public static int maxSubArray(int[] nums){ 
		if(nums == null || nums.length == 0 ) {
			return 0;
		} else if(nums.length == 1 ) {
			return nums[0];
		}
		
		int sum = nums[0];
		int nextSum= nums[0];
		for(int i=1; i< nums.length; i++) {

			
			if(nextSum + nums[i] < nums[i] ) { 
				nextSum = nums[i];
			} else {
				nextSum += nums[i];
			}
			sum = Math.max(sum, nextSum);
		}
		
		
		return sum;
	}

}
