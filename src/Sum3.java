import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {
	public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		
		if(nums == null || nums.length == 0 || nums.length < 3) {
			return list;
		}
		
        
		int sum =0;
		int temp= Integer.MAX_VALUE;
        int oldLeft = Integer.MAX_VALUE;
        //temp!= nums
        // -1 -1 2
		for(int i =0; i < nums.length; i ++) {
			int left=i+1;
			int right = nums.length-1;
			
			 
			while(left < right) {
				sum = nums[i] + nums[left] + nums[right];
				if(nums[i] == temp ) {
					break;
				}

				if(sum > 0 ) {
					right = right - 1 ; 
				} else if (sum < 0) {
                    
					left = left + 1; 
				} else {
                    if(oldLeft == nums[left]){
                        left++;
                    } else{
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    oldLeft = nums[left];
					left = left + 1;
                    }
				} 
                // 0 0 0 0
                //[3,0,-2,-1,1,2]
                // -2 -1 0 1 2 3 
			}
            oldLeft = Integer.MAX_VALUE;
			temp = nums[i];
           

		}
        return list;
    }
	
	public static void main(String[] args) {
		
	}
		
}

