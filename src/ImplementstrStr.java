
public class ImplementstrStr {

	public static void main(String[] args) {
		String haystack = "aaa";
		String needle = "aa";
		
		System.out.println(strStr(haystack, needle));
	}
	public static int strStr(String haystack, String needle) {

        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0 ){
        return -1;
       }
		for(int i=0; i < haystack.length()-(needle.length() -1); i ++) {
			char hayStackChar = haystack.charAt(i);
			
				if(hayStackChar == needle.charAt(0)) {
					if(needle.length() == 1) {
						return i;
					}
			String subString = (i+needle.length()) > haystack.length()
							?"" : haystack.substring(i, i + needle.length());
					if(subString.equals(needle)) {
						return i;
					}
					
				}
		}
		return -1;
	}

}
