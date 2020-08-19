import java.util.HashMap;

public class RomanceNumber {   
	public int romanToInt(String s) {
		
		//check to see if the String is empy; 
		if(s.length() ==0 || s == null) {
			
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		
		hm.put('I', 1);
		hm.put('X', 5);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		//initiate romanTotal with the last value of the String 
		int romanTotal = hm.get(s.charAt(s.length() - 1));

		//moving from the last index of the String 
		for(int i= s.length() -2 ; i >=  0; i--) {
			//because the biggest roman value will be at the beginning of the String
			//if the left number is smaller than the right number then take the number on he right and subtract the number on the left
			if(hm.get(s.charAt(i)) >=hm.get(s.charAt(i+1)) ) {
				romanTotal = romanTotal + hm.get(s.charAt(i));
			} 
			else romanTotal = romanTotal - hm.get(s.charAt(i));
			 
			
		}
		
		return romanTotal;
		
	}
}