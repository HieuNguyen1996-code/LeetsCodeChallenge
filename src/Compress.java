

public class Compress {
	public static void main (String[] args ) {
		System.out.println(compress("AAABBCCCCAAAA"));
	}
	
	public static String compress(String input) {
		// time complexity is O(n) 
		// space complexity is O(n)
		// if input is 0;
		if(input.length() == 0) {
			return input;
		}// if the input is 1;  
		else if(input.length() ==1 ) return (input.length() + input + "x");
		int count =1;
		String result ="";
		int currentIndex = 0;
		// go through loops
		for(int i =1; i< input.length() ;i++) {
			if(input.charAt(i) == input.charAt(currentIndex)) {
				// count increment
				count++;
			} else {
				// adding the result when we see different characters
				if(count == 1 ) {
					result += input.charAt(currentIndex);
				}
				else if(count == 2) { 
					result += input.charAt(currentIndex) +"" + input.charAt(currentIndex);

				}else {
				result += count+"x" +input.charAt(currentIndex);
				}
				currentIndex = i;
				count = 1;

			}
			
			
			
		}
		// handling last case 
		if(input.charAt(currentIndex-1) != input.charAt(input.length()-1)) {
			result += count+"x" +input.charAt(currentIndex);
		}
		
		return result; 
	}
	

}

