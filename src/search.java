
public class search {
	public static int searchTarget(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		//checking if the nums has numbers
		if(nums == null || nums.length < 0) {
			return -1;
		}
		
		
		while(start <= end) {
			if(target == nums[start]) {
					return start;
			}else if(target == nums[end]) {
				return end;
			}
				
			start++;
			end--;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] nums = {123,5775,2235,89986,10};
		System.out.println(searchTarget(nums, 5775));
	}

}
