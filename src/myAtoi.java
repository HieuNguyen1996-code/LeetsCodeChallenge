
public class myAtoi {
	public int findNumberString(String s) {
		
		
		char[] charsNumbers = s.toCharArray();
		StringBuilder stringNumbers= new StringBuilder();
		int  current = 0;
		
		if(s == null || Character.isAlphabetic(s.charAt(current))) {
			return 0;
		}
		
		for(int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(current))) {
				stringNumbers.append(s.charAt(current));
				current++;
			} else current = i;
		}

		
		int nums = Integer.parseInt(stringNumbers.toString());  
				
		
		
		return nums;
		
	}

}
