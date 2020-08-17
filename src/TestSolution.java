
public class TestSolution {

	public static void main(String[] args) {
		
		int[] numbers = {3,2,4};
		TwoSum sumOfNumbers = new TwoSum();
		
		//print out solution for finding Sum of two numbers
		int[] sum = sumOfNumbers.Sum(numbers, 6);
		
		for(int i=0; i < sum.length; i++)
			System.out.print(sum[i] + " ");
	}
	
}
