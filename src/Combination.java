import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		System.out.println(combine(4,2));

//		  [2,4],
//		  [3,4],
//		  [2,3],
//		  [1,2],
//		  [1,3],
//		  [1,4],
	}
	
	public static List<List<Integer>> combine(int n, int k) { 

		List<List<Integer>> result = new ArrayList<>();
		
		if(n ==0) {
			return result; 
		}
		combineRecursive(result, n,k, new int[k-1], 0);
		return result;
		
	}
	
	public static void combineRecursive(List<List<Integer>>result, int n, int k, int[] arr, int index){
		
		if(n>0) { combineRecursive(result, n-1, k, arr, index);}
		if(index>k) {
			combineRecursive(result, n, k, arr, index+1);
		}
 
	}

}
