
public class SearchIndex {

	public static void main(String[] args) {

		int[] nums = {1,3};
		System.out.println(searchInsert(nums, 3));

	}
	public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) { 

            return 0;
        }
//        int start =0;
//        int end = nums.length; 
//        int mid = (end-start)/2;
//        
//        while(start< end) { 
//        	if(nums[mid] == target) { 
//        		return mid; 
//        	}
//        	
//        	if(nums[mid] > target) { 
//        		mid = mid/2;
//        	} else if (nums[mid] < target) { 
//        		mid = (end-mid)/2; 
//        	}
//        }
//    
        for(int i = 0; i < nums.length-1; i++) { 
        	if (nums[i] == target) return i ; 
        	
        	if (nums[i] < target && nums[i+1] >= target) { 
        		 
        		System.out.println("found it");
        		return i+1;
        	}
        }
        if(nums[nums.length -1] < target) { 
        	return nums.length;
        } else return 0;

    }

}
