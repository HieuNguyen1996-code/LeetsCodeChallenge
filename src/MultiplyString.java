import java.util.HashMap;

public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "23";
		String num2 = "2";
		System.out.print(multiply(num1,num2));
	}
	
	public static String multiply(String num1, String num2) {
		
		if(num1.length() == 0 || num1 == null
				|| num2.length() == 0 || num2 == null ) {
			return null;
			
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
		int lastDigit = 0;
		int remainder = 0;
		int count = 1;
		String copyResult = "";

		String result = "";
			
		
		
		
		for(int i = num1.length() -1; i>=0; i--) {

			for(int j = num2.length() -1; j >= 0; j--) {

				number1 = map.get(num1.charAt(i));
				number2 = map.get(num2.charAt(j));

				mult = (number1*number2) + remainder;
				remainder = mult/10; 
				lastDigit = mult%10;
				
				if(j ==0) {

					result =  Integer.toString(remainder) + Integer.toString(lastDigit) + result;
				}else 
					result = Integer.toString(lastDigit) + result;
				
				
				 
				
			}

			
			copyResult = result;
			result = "";
			System.out.println(copyResult);
			
		}		
		
		
		
	
		
		return "";
	}

}
