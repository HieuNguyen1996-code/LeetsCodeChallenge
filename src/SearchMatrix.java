
public class SearchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{}};
		System.out.println(searchMatrix(matrix, 3));

	}
	public static boolean searchMatrix(int[][] matrix, int target){ 
		if(matrix == null || matrix.length ==0 || matrix[0].length == 0) {
			return false; 
		} 	
		
		for(int i=0; i <matrix.length; i++) {
			if(matrix[i][matrix[0].length-1] >= target) {
				for(int j =0; j< matrix[0].length;j++) {
					if(matrix[i][j] == target) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
