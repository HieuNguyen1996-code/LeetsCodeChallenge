import java.util.HashMap;

public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "55";
		String num2 = "67";
		System.out.print(multiply(num1,num2));
	}
	
	public static String multiply(String num1, String num2) {
		if(num1 == null|| num1.length() == 0 || num1.length() > 110  ||
				num2 == null|| num2.length() == 0 || num2.length() > 110) {
			
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('0',0);
		map.put('1',1);
		map.put('2',2);
		map.put('3',3);
		map.put('4',4);
		map.put('5',5);
		map.put('6',6);
		map.put('7',7);
		map.put('8',8);
		map.put('9',9);
		
		int number1 = 0;
		int number2 = 0;
		int mult = 0;
		int remainder = 0;
		String stringNumber1 = "";

		String resultMultiply = String.valueOf("");
		for(int i = num1.length() -1; i>=0; i--) {
			for(int j = num2.length() -1; j >= 0; j--) {
				number1 = map.get(num1.charAt(i));
				number2 = map.get(num2.charAt(j));
				
				mult = (number1*number2);
				remainder = mult/10;
				resultMultiply = String.valueOf(mult%10) + resultMultiply;
				
				mult = 0;
				
			}
		}		
		
		
		
	
		
		return "";
	}

}
