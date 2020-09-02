import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
//		Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//				Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
		int[][] matrix = 
				{		{5,1,9,11},
						{2,4,8,10},
						{13,3,6,7},
						{15,14,12,16}};
		rotate(matrix);
		
	}
	public static void rotate(int[][] matrix) {
		int end = matrix.length -1;
		int start = 0;
		int temp = 0;
		if(matrix.length == 0 || matrix == null ) {
		}else if (matrix.length == 1) {
			//System.out.println(matrix.toString());
		}
		
		for(int i =0; i < matrix.length; i++) {
			for(int j = i+1; j < matrix.length; j++) {
				temp = matrix[i][j];
				
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

				//System.out.println("[" + i +"," + j +"]");
			}
		}
		// swith operation 
		int count =0 ;
		while(count< matrix.length ) {
			while(start < end) {
				// moving start up by one 
				// moving end down by one 
				temp = matrix[count][start];
				matrix[count][start] = matrix[count][end];
				matrix[count][end] = temp;
				start++;
				end--;

			}
			start = 0;
			end = matrix.length-1;
			count++;
	
		}

		System.out.println(Arrays.deepToString(matrix));
		
	}

}
