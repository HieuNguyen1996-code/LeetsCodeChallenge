import java.util.Stack;

public class FindLongestPalindrome {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows =1;
		
		System.out.println(convert(s,numRows));
		
			
	}
	// ASDFGHJKL
	public static String convert(String s, int numRows) {
		if(numRows == 0) {
			return "";
		}
		else if (numRows == 1 ) {
			return s;
		}
        boolean TF = true;
		int count =0;
		String[] temp = new String[numRows];
		for(int i =0; i<temp.length;i++) {
			temp[i] = "";
		}
		for(int i =0; i < s.length(); i++) {
			temp[count] = temp[count]+s.charAt(i);
			if(count == numRows-1) {
				TF = false;		
			} else if(count <= 0) { TF = true;
				
			}
			if(TF) {
				count++;
			} else if (!TF) {
				count--;
			}
			
		}
		String str= "";
		for(int i=0; i < temp.length; i++) {
			str = str + temp[i];

		}
		return str;
    }
	//temp[]

}
