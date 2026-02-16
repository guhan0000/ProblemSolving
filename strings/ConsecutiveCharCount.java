package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConsecutiveCharCount {
	public static void main(String[] args) {
		String str="aabbbbeeeeffggg";
		StringBuilder result=new StringBuilder();
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()==1) {
				result.append(entry.getKey());
//				result.append(entry.getValue());
			}else {
				result.append(entry.getKey());
				result.append(entry.getValue());
			}
		}
		System.out.println(result.toString());
		
	}

}
