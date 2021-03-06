import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
	public static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		recursivePermutation(list, nums, 0);
		return list;
	}
	public static void recursivePermutation(List<List<Integer>> list, int[] nums, int index) {
		if(index == nums.length) {
			List<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toList());
			list.add(s);
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

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4};
		System.out.println(permutation(nums).toString());
		System.out.println(permutation(nums).size());
	}

}
