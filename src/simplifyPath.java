import java.util.Stack;

public class simplifyPath {

	public static void main(String[] args) {
		System.out.println(path("/a//b////c/d//././/.."));

	}
	
	public static String path(String path) { 
		String[] list = path.split("/");
		// .. is to reset 
		// . go up one file 
		// / go to the other directory 
		Stack directory = new Stack();
		String result = "";
		for(int i = 0; i < list.length; i++) { 
			
			if(list[i].equals("..")) {
				directory.pop();
			} else if (!list[i].equals(".") && !list[i].equals("")) { 
				directory.push(list[i]);
				
			}
			 
		}
		System.out.println(directory.size());
		
		while(!directory.isEmpty()) {
			result = "/" + directory.pop() +result;
			
		}
		
		
		
		return result;
	}

}
