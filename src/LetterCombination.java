import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

	public static void main(String[] args) {
		System.out.println(letterCombinations("235"));
		
	}
	
	public static String justString(String s1, String s2) {
		StringBuilder newString = new StringBuilder();
		for(int i =0; i < s1.length(); i ++) {
			for(int j=0; j < s2.length(); j++) {
				
				
				newString.append(s1.charAt(i));
				newString.append(s2.charAt(j));
				
			}
		}
		
		
	return newString.toString();
	}
	 public static List<String> letterCombinations(String digits) {
		 

		 List<String> list = new ArrayList<String>();
		 
		 if(digits.length() == 0 || digits == null) {
			 return list;
		 }
		 
		 Map<Character,String> numbers = new HashMap<Character, String>();
		 numbers.put('2', "abc");numbers.put('3',"def"); numbers.put('4', "ghi");
		 	numbers.put('5',"jkl");numbers.put('6', "mno");numbers.put('7', "pqrs");
		 		numbers.put('8', "tuv");numbers.put('9', "wxyz");
		 
		 int count = 0;
		 StringBuilder newString = new StringBuilder();
		 String s1 = "";

		 
		 
             s1 = (numbers.get(digits.charAt(0)));
             for(int i =0; i < s1.length(); i ++ ){
            	 newString.append(s1.charAt(i));
            	 list.add(newString.toString());
                  newString.delete(0, 1);

             }
             count++;
             System.out.println(list);
               //  return list;
		 // 34
		 List<String> result = new ArrayList<String>();
		 while(count < digits.length()) {
			 //int nums = Integer.parseInt(digits);
			 s1=(numbers.get(digits.charAt(count)));
			 //s2.append(numbers.get(digits.charAt(count+1)));
			 
			 
			 // def + abc = ad, ae , af......
			 // 235
			 //j k l 
			 for(int i = 0 ; i < s1.length(); i ++) {
				// System.out.println(list);
				// System.out.println();
					for(int j= 0; j < list.size(); j++) {
						// ad + ae + af + bd + be+ bf + cd + ce 
						//ad, ar, af .... + j + k+ l = 
						result.add(list.get(j) + s1.charAt(i));
						//System.out.print(result);

						
						// update list 
						
						
					}
					//System.out.print(result);
					
			 }
			 
			 list = result;
			result = new ArrayList<String>();
			 
			 count++;
		 }
		
		 
		 return list; 
	     }
	 public static List<String> letterCombinations2(String digits) {
		 List<String> list = new ArrayList<String>();
		 
		 if(digits.length() ==0 || digits == null) {
			 return list;
		 }
		 
		 Map<Character,String> numbers = new HashMap<Character, String>();
		 numbers.put('2', "abc");numbers.put('3',"def"); numbers.put('4', "ghi");
		 	numbers.put('5',"jkl");numbers.put('6', "mno");numbers.put('7', "pqrs");
		 		numbers.put('8', "tuv");numbers.put('9', "wxyz");
		 
		 int count = 0; 
		 StringBuilder stringDigit = new StringBuilder();
		 String letter =  "" ; 
		 
		 while(count < digits.length()) {
			 stringDigit.append(numbers.get(digits.charAt(count)));
			 for(int i =0; i < stringDigit.length(); i++) {
				 
			 }
			 count++;
		 }
		 
		 
		 
		 
		 return list;
	 }
	 

}
