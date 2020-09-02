import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
	public static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int start = 1;
		int end = nums.length -1;
		int pointer =0;
		
	
		System.out.println(list.toString());
		return list;
	}
	public static void recursivePermutation(List<List<Integer>> list, int[] nums, int index) {
		if(index >= nums.length) {
			return;
		}
		for(int i =0; i < nums.length; i++) {
			if(index != i) {
				List<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toList());
			}
		}
		recursivePermutation(list,nums, index++);
	}

	public static void main(String[] args) {
		
		int[] nums= {1,2,3};
		int index =0;
		int currentIndex =0;
		while(index < nums.length) {
			for(int i =0; i < nums.length; i++) {
				if(index!=i) {
					for(int j = index+1; j < nums.length; j++) {
						if(j!= i) {
							System.out.println(i + " "   + index+ " " + j+ " ");
							System.out.println(Arrays.toString(nums));
						}
					}

				}

			}
			index++;
		}
	}

}
