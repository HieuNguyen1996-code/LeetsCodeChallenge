import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public static void main(String[] args) { 
		int n = 3; 
		System.out.println(generateParenthesis(3));
		
		
	}
	
	public static List<String> generateParenthesis(int n){ 
		List<String> result = new ArrayList<>();
		recursiveBacktracking(result, "", n, 0, 0);
		return result;
	}
	
	public static void recursiveBacktracking(List<String> result, String parathesis,int n, int open, int close ) { 
		
		if(parathesis.length() == n*2) { 
			result.add(parathesis); // a String;
			return;
		}
		
		if(open < n) recursiveBacktracking(result, parathesis + "(", n, open+1, close);
		if(close < open) recursiveBacktracking(result, parathesis +")", n, open, close +1);
	}

}
