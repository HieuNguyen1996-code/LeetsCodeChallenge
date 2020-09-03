import java.util.HashMap;
import java.util.Map;

public class TestSolution {

	public static void main(String[] args) {
		System.out.println("ate".compareTo("ate"));
	
		
	}
   
	public static int findNumberString(String s) {
		 
		//num*10 + s.charAt(current);
		long nums = 0;
			int count =0;
			char[] charsNumbers = s.toCharArray();
			StringBuilder stringNumbers= new StringBuilder();
			int  current = 0;
			
			if(s.length() ==0||s == null || Character.isAlphabetic(s.charAt(current))) {
				return 0;
			}
			//1aa1234asd
			while(current < s.length()) {
				if(Character.isAlphabetic(s.charAt(current))) {
					break;
				}
				
				if(s.charAt(current) == '-' || s.charAt(current) == '+') {
					stringNumbers.append(s.charAt(current));
					
					
				}
				
				
				if(Character.isDigit(s.charAt(current))) {
					stringNumbers.append(s.charAt(current));
					nums = Long.parseLong(stringNumbers.toString());  
					
					if(nums<Integer.MIN_VALUE ) {
						return Integer.MIN_VALUE ;
					}
					if(nums > Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					}
					
				}
				if(s.charAt(current) == '.') {
						return  (int)nums;
					}
				
				

				current++;
			}
			
			
			
			
			
			return (int)nums;
			
		}
	}