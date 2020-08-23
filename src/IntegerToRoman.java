import java.util.HashMap;

public class IntegerToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(99)); // MI
	}
	
	public static String intToRoman(int num) {
		String str = Integer.toString(num);
		//1994 has 4 digit
		int len = str.length()-1;
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		//####=M + M + M
		//###= M - C + D
		//##= X+ L + C 
		//#= IVX
		map.put(1, "I");
		map.put(2, "II");
		map.put(3, "II");
		map.put(4,"IV");
		map.put(5, "V");
		map.put(6, "VI");
		map.put(7, "VII");
		map.put(8, "VIII");
		map.put(9, "IX");
		map.put(10,"X");
		map.put(20, "XX");
		map.put(30, "XXX");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(60, "LX");
		map.put(70, "LXX");
		map.put(80, "LXXX");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(200, "CC");
		map.put(300, "CCC");
		map.put(400,"CD");
		map.put(500, "D");
		map.put(600,"DC");
		map.put(700, "DCC");
		map.put(800, "DCCC");
		map.put(900, "CM");
		map.put(1000, "M");
		map.put(2000,"MM");
		map.put(3000,"MMM");
		//to store the value 
		StringBuilder s = new StringBuilder();
		String newString = ""; 
		int remain = 0;
		int i=1000;
		if(num < 10) {
				//9%10 =9
				return s.append(map.get(num%10)).toString();
		}

		
		while(num != 0) {
			remain = (num/i) * i; 
			if(remain !=0) {
				s.append(map.get(remain));
			} 	
			num = num%i;
			i = i / 10;//100

		}
		
		newString = s.toString();

		return s.toString();
	}

}
