import java.util.ArrayList;
import java.util.List;
public class SpiniralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
		                  { 1, 2, 3 },
		                  { 4, 5, 6 },
		                  { 7, 8, 9 }
		                 };
		System.out.println(order(matrix));
	}
	
	public static List<Integer> order(int[][] matrix){
		List<Integer> list = new ArrayList<>();
		if(matrix.length == 0) {
			return list;
		}
		int len = matrix.length*matrix[0].length; 
		int count= 0;
		int maxRow = matrix.length -1;//3
		int maxColumn = matrix[0].length-1;//4
		int minRow =0;
		int minColumn =0;
		int currentRow = 0;
		int currentColumn=0;
		while(count < len) {
			System.out.println("max " + maxColumn +" minColumn " + minColumn);
			for(int i=minColumn; i<=maxColumn;i++) {
				list.add(matrix[currentRow][i]);
				
		
				count++;
				if(count >= len) {
					return list;
				}
			}
			System.out.println("len" + len);
			System.out.println("count" + count );
			
			currentColumn = maxColumn;
			minRow = minRow+1;
			for(int i=minRow; i <= maxRow; i++) {
				list.add(matrix[i][currentColumn]);
					count++;
				if(count >= len) {
				return list;
				}
			
			}
			
			currentRow = maxRow;
			maxColumn = maxColumn-1;
			
			for(int i= maxColumn; i >= minColumn; i-- ) {
				list.add(matrix[currentRow][i]);
				count++;
				if(count >= len) {
				return list;
				}
				

			}
			
			maxRow = maxRow-1;
			System.out.println(maxRow);
			System.out.println(minRow);
			currentColumn = minColumn;
			
			
			for(int i= maxRow; i >= minRow; i-- ) {
				list.add(matrix[i][currentColumn]);
				count++;
				if(count >= len) {
				return list;
				}
				

			}
			minColumn= minColumn+1;
			currentColumn = minColumn;
			currentRow = maxRow;
		

		}
		
		return list;
	}
    public static List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> list = new ArrayList<>();
    	int rowStart = 0;
    	int rowEnd = matrix.length -1;
    	int columnStart =0;
    	int columnEnd = matrix[0].length-1;
    	
    	while(rowStart <= columnStart && rowEnd <= columnEnd) {
    		for(int i =columnStart; i<= columnEnd; i++ ) {
    			
    		}
    	}
    	
    	return list;
    }
  

}
