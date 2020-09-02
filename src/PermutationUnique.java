import java.util.*;
import java.util.stream.Collectors;

public class PermutationUnique {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		recursivePermutation(list, nums, 0);
		return list;
	}
	public static void recursivePermutation(List<List<Integer>> list, int[] nums, int index) {
		if(index == nums.length) {
			List<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toList());
            if(!list.contains(s)){
			list.add(s);
            }
			return;
		}
		for(int i =index; i < nums.length; i++) {
			 int temp = nums[i];
			 nums[i] = nums[index];
			 nums[index] = temp;
			 
			 recursivePermutation(list, nums, index+1);
			 
			 temp = nums[i];
			 nums[i] = nums[index];
			 nums[index] = temp;
			 
		}
	}


}
