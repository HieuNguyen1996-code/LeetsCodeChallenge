
public class SetMatrixZero {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,1,1},
				{1,0,1},
				{1,1,1},
				};
		int[][] newMatrix = setMatrixZero(matrix);
		for(int[] i: matrix) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	public static int[][] setMatrixZero(int[][] matrix){
		
		for(int i=0; i< matrix.length; i++) { 
			for(int j =0; j<matrix[0].length;j++) {
				matrix[i][j] = matrix[j][i];
				if(matrix[i][j] == 0) {
					
					if(i>0)matrix[i-1][j] = 0;
					if(j>0)	matrix[i][j-1] = 0;
					
					
				}
				
				
			}
		}
		
		
		
		return matrix;
	}

}
