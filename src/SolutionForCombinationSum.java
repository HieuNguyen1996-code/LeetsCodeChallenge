import java.util.ArrayList;
import java.util.List;

public class SolutionForCombinationSum {

	public static void main(String[] args) {
		int[] numbers = {2,3,6,7};
		System.out.println(combinationSum(numbers, 10));

	}
	public static List<List<Integer>> combinationSum(int[] candidate, int target){
		List<List<Integer>> solution = new ArrayList<List<Integer>>();
		int pointer = 0;
		int start = 1;
		int end = candidate.length -1;
		int sum =0;
		// check if the sum = target
		// check if the pointer add itself to the target; 
		// if it does not add number on the left
		// if the sum of the pointer and left > target
		// then add the sum + left + right
		// if doesnt move the pointer up by one
		// keep adding the number until we found it 
		//System.out.print(sum+candidate[pointer]);
		if((sum+= candidate[pointer]) < target) {
			// keep adding the number
			System.out.println("w");
		}else if((sum += candidate[start]) < target) {
			System.out.println("a");
		}
			
			
		return solution;
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidate, int target){
		List<List<Integer>> solution = new ArrayList<List<Integer>>();
		
		return solution;

	}
}
