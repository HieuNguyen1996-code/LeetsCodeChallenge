import java.util.ArrayList;
import java.util.*;
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] numbers =  {
					{'5','3','.','.','7','.','.','.','.'},
				  {'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}
		};
		
		System.out.println(isValidSudoku(numbers));
		

	}
	public static boolean isValidSudoku(char[][] board) {

		
		HashSet<Character> dataRows = new HashSet<Character>();
		HashSet<Character> dataColumns = new HashSet<Character>();
		HashSet<Character> dataBox = new HashSet<Character>();		
		
		for(int i=0; i <9  ; i++) {
			for(int j = 0 ; j < 9 ; j++) {
				if(Character.isDigit(board[j][i])) {
					if(!dataColumns.add(board[j][i])) {
						return false;
					}
				}
				if(Character.isDigit(board[i][j])) {
					if(!dataRows.add(board[i][j])) {
						return false;
					}
				}
			}
			dataRows.clear();
			dataColumns.clear();
		}
		//
		for(int i =0; i < 9; i+=3) {
			for(int j = 0; j < 9; j+= 3) {
				if(Character.isDigit(board[j][i])) {
					if(!dataBox.add(board[j][i])) {
						return false;
					}
				}
				if(Character.isDigit(board[j][i+1])) {
					if(!dataBox.add(board[j][i+1])) {
						return false;
					}
				}
				if(Character.isDigit(board[j][i+2])) {
					if(!dataBox.add(board[j][i+2])) {
						return false;
					}
				}
				if(Character.isDigit(board[j+1][i])) {
					if(!dataBox.add(board[j+1][i])) {
						return false;
					}
				}
				if(Character.isDigit(board[j+1][i+1])) {
					if(!dataBox.add(board[j+1][i+1])) {
						return false;
					}
				}
				if(Character.isDigit(board[j+1][i+2])) {
					if(!dataBox.add(board[j+1][i+2])) {
						return false;
					}
				}
				if(Character.isDigit(board[j+2][i])) {
					if(!dataBox.add(board[j+2][i])) {
						return false;
					}
				}
				if(Character.isDigit(board[j+2][i+1])) {
					if(!dataBox.add(board[j+2][i+1])) {
						return false;
					}
				}
				if(Character.isDigit(board[j+2][i+2])) {
					if(!dataBox.add(board[j+2][i+2])) {
						return false;
					}
				}
				dataBox.clear();
			}
			
				
			}
		return true;
    }

}
