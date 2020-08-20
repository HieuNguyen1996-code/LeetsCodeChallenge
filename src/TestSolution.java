import java.util.HashMap;
import java.util.Map;

public class TestSolution {

	public static void main(String[] args) {
		String s = "IV";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int len = s.length();
		int romanTotal = hm.get(s.charAt(len - 1));

		
		for(int i= s.length() -2 ; i >=  0; i--) {
			if(hm.get(s.charAt(i)) >=hm.get(s.charAt(i+1)) ) {
				romanTotal = romanTotal + hm.get(s.charAt(i));
			} 
			else romanTotal = romanTotal - hm.get(s.charAt(i));
			 
			
		}
		System.out.print(romanTotal);



	}
	
}
