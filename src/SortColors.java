
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		
		sortColors(nums);
		for(int i =0; i < nums.length; i++) { 
			System.out.println(nums[i]);
		}
		
	}
	
	public static void sortColors(int[] nums){
		int count0 =0;
		int count1 =0;
		 int count2 =0; 
		 
		for(int i =0; i < nums.length; i++) { 
			if(nums[i] == 0) { 
				count0++;
			} else if(nums[i] == 1) {
				count1++;
			} else if(nums[i] == 2)count2++;
		}
		
		for(int i =0; i < nums.length; i++) { 
			if(count0 > 0) {
				nums[i] = 0;
				
				count0--;
			} else if(count1 > 0 ) { 
				nums[i] = 1;
				count1--;
			} else if(count2 > 0) {
				nums[i] = 2;
				count2--;
			}
		}
		
	}

}
