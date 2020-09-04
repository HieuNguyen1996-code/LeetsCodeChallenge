
public class JumpGame {
	public static boolean canJump(int[] nums) {
		if(nums.length==0) {
			return false;
		}

		int pivot = nums.length -1;
		for(int i =nums.length -1 ; i >=0; i--) {
			if(nums[i] >= (pivot-i)) {
				pivot = i;
			}
		}
		
		if(pivot == 0) {
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		
		System.out.println(canJump(nums));

	}

}
