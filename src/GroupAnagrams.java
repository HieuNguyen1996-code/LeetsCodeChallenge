import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {
				"eat","tea","tan","ate","nat","bat"
		};
		System.out.println(groupAnagrams(strs));
	}
	public static List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>>  list = new ArrayList<>();
		
		HashMap<String,Integer> map = new HashMap<>();
		
		if(strs.length ==0 || strs == null) {
			return list;
		}
		int count = 0;

		
		for(int i =0; i< strs.length;i++) {
			List<String>  temp = new ArrayList<>();
			char[] sortStr = strs[i].toCharArray();
			Arrays.sort(sortStr);
			String sorted = String.valueOf(sortStr);
			if(!map.containsKey(sorted)) {
				map.put(sorted, count);
				list.add(Arrays.asList(strs[i]));//
				count++;
			}else {
				temp = new ArrayList(list.get(map.get(sorted)));
				temp.add(strs[i]);
				list.set(map.get(sorted), temp);
			}
			
		}

		
		return list;
	}
	        
	

}
