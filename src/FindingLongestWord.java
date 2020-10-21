
public class FindingLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));

	}
	
	public static int lengthOfLastWord(String s) {
		if(s.length() == 0) { 
			return 0;
		}
		
		int count = 0; 
		int  result = 0;
		String[] subStr = s.split(" ");
		if(subStr.length ==0 ) { 
			return 0;
		}
		return subStr[subStr.length-1].length();
		
	}

}
