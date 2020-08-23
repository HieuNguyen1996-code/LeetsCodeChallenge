import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
	public static List<List<Integer>> threeSum(int[] nums) {
		/*
		  Given array nums = [-1, 0, 1, 2, -1, -4],
				
				A solution set is:
				[
				  [-1, 0, 1],
				  [-1, -1, 2]
				]
		 */
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < nums.length-2; i ++) {
			for(int j =i+1; j < nums.length-1; j++) {
				for(int k =j+1; k < nums.length;k++) {
					int number = nums[k] + nums[j] + nums[i];
					if(number == 0) {
						list.add(Arrays.asList(nums[i],nums[j], nums[k]));
					}
				}
			}
			
		}
		return list;
	}
	public static void main(String[] args) {
		int[] numbers= {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> num1 = threeSum(numbers);
		System.out.println(threeSum(numbers).toString());
		}
	}

