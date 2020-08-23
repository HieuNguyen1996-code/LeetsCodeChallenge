
public class ContainMostWater {
	 public int maxArea(int[] height) {
	    	
	    	int currentArea = 0;
	    	int area = 0;
	    	for(int i =0; i < height.length; i++) {
	    		for(int j=0; j < height.length; j++) {
	    			if(height[j] >= height[i]) {
	    				currentArea = height[i]*(j-i);
	    			}else currentArea = height[j] * (j-i);
	    			if(currentArea > area ) {
	    				area = currentArea;
	    			}
	    		}
	    	}
	    	
	        return area;
	    }
	 public int fasterMaxArea(int[] height) {
		 int start = 0;
		 int end = height.length -1;
		 int area =0;
		 
		 while(start < end) {
			 
			 if(height[start] >= height[end]) {
				 area = Math.max(area, (end-start) * height[end]);
				 end--;
				 
			 }
			 if(height[start] <= height[end]) {
				 area = Math.max(area, (end-start) * height[start]);
				 start++;
			 }
			 
			
		 }
		 
		 return area;
	 }
}
