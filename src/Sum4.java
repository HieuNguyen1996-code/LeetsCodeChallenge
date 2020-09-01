import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {

	public static void main(String[] args) {
		int[] number = {-3,-2,-1,0,0,1,2,3};
			
		System.out.println(Sum(number,0));
		
	}
		public static List<List<Integer>> Sum(int[] nums, int target) {
	        
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
			Arrays.sort(nums);
			
			if(nums == null || nums.length == 0 || nums.length < 4) {
				return list;
			}
			
	        
			int sum =0;
			int temp= Integer.MAX_VALUE;
	        int oldLeft = Integer.MAX_VALUE;
	        int previousJ = Integer.MAX_VALUE;
	        //temp!= nums
	        // -1 -1 2
	        
			for(int i =0; i < nums.length; i ++) {
				
		
				if(nums[i] != temp ) {
					temp = nums[i];
					 for(int j = i + 1; j < nums.length -2 ;j++) {
							int left = j+1;	
							int right = nums.length-1;
							if(nums[j] != previousJ) {
								previousJ = nums[j];
								while(left < right) {
									
									sum = nums[i] + nums[left] + nums[right] + nums[j];
									
									if(sum > target ) {
										right = right - 1 ; 
									} else if (sum < target) {
					                    
										left = left + 1; 
									} else {
					                    if(oldLeft == nums[left]){
					                        left++;
					                    } else{
										list.add(Arrays.asList(nums[i], nums[j],nums[left], nums[right]));
					                    oldLeft = nums[left];
					                    
										left = left + 1;
					                    }
									} 
					                
								}
							}
				
							oldLeft = Integer.MAX_VALUE;
							
						}
					 previousJ = Integer.MAX_VALUE;
					
				}

				
	            
				
	           

		}
	        return list;
	    }
}