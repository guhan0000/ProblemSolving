package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str="leetcode";
		Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>e:map.entrySet()) {
//			System.out.println(e.getKey()+" -> "+e.getValue());
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				break;
			}
		}
		
	}

}
