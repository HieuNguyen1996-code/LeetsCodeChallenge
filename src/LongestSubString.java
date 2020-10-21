import java.util.HashSet;

public class LongestSubString {
	public static void main (String[] args ) { 
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		
	}
	
	public static int lengthOfLongestSubstring(String s) {
		if(s.length() ==0) return s.length(); 
		
		
		HashSet<Character> set = new HashSet<>();
		int solution = 0 ;
		int tracking = 0;
		int start = 0; 
		

		while(tracking < s.length()) { 
			if(!set.contains(s.charAt(tracking))) { 
				set.add(s.charAt(tracking));
				tracking++;
				solution = Math.max(set.size(), solution);	
			} else { 
				set.remove(s.charAt(start));
				start++;
			}
		}
		
		
		return solution;
		
	}

}
