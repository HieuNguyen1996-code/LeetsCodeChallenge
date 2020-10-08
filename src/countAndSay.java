
public class countAndSay {

	public static void main(String[] args) {
		System.out.println(countandSay(7));

	}
	
	public static String countAndsay(int n) {
		if(n == 0) { 
			return "";
		}
		String result = "1";
		String temp ="";
		
		char previous= result.charAt(0); 
		if(n == 1) { 
			return result;
		}
		//start counting the number
		// if the number 
		while(n-1>0) { 
			int count = 0;
			previous = result.charAt(0);
			for(int i=0; i < result.length(); i++) {
				count++;
				if(result.charAt(i) == previous && result.length()-1 > i) {
					

				}else {
					
					temp = "" +count + "" +previous + temp;
					previous = result.charAt(i);// 2
					count = 0;
					System.out.println(temp);
					
				}
				
				// if count is not zero then start store the number.
				// update previous when they are not equal 

			}
			result = temp;
			
			temp="";
			
			n--;
		}
		return result;
	}
	public static String countandSay(int n) {
		if(n==0) return "";
		
		if(n==1) return "1";
		String result = "1";
		String temp = "";
		int count =1;
		
		for(int i =0; i< n-1; i++) {
			
			for(int j = 1; j<= result.length(); j++) {
				
				if( j < result.length() && result.charAt(j) == result.charAt(j-1) ) {
					count++;
				} else {
					temp += count + "" + result.charAt(j-1) ;
					count = 1; 
					
				}
				
			}
			result = temp;
			temp="";
		}
		
		return result;
		
	}

}
