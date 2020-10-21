import java.util.Stack;

public class MinimumSwap {
	public static void main(String args[]) {
		System.out.println(minSwap("]]][[["));
		//[] ]][[ 
		//       ]][[ []
		// ]]][[[ -> []][[]
		// 012345	 012345
	}
	public static int minSwap(String input) {
		//Time complexity O(n)
		//Space Complexity O(n)
		char[] bracketContainer = input.toCharArray(); 
		// keep track on left and right
		int countLeft = 0;
        int countRight = 0;  
         
        int swap = 0 ;
        int imbalance = 0;  
        // go through the String
        for(int i =0; i< bracketContainer.length; i++)  
        { 
        	// increase count on the left if == [
            if(bracketContainer[i] == '[')  
            { 
                
                countLeft++;  
                // add swap to imbalance
                // and in decrease imbalance
                if(imbalance > 0)  
                {
                   
                    swap += imbalance;  
                    
                    imbalance--;      
                } 
            }//increase on the right
            // set the imbalance equal to the length of right and left
            //[]][
            else if(bracketContainer[i] == ']' )  
            { 
                countRight++;  
               
                imbalance = (countRight-countLeft);  
            } 
        } 
        return swap;
	}


}
