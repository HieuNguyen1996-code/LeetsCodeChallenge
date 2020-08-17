
public class TwoSum {
	
	public int[] Sum(int[] nums, int target) {
		//find the sum of 2 numbers that equal to the target
		//create new array to store the solution
		//return the new array;
		//if the target does not exist return null

		for(int i=0; i < nums.length; i++) {
			for(int j=i+1; j< nums.length; j++) {
				int sum = nums[i] + nums[j];
				if(sum == target) {
				int[] solution = {i,j};
				return solution;
				}
			}
		}

		return null;
	}
	
	
}
