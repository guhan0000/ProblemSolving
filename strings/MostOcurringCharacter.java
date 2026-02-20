package strings;

import java.util.HashMap;
import java.util.Map;

public class MostOcurringCharacter {
	
	static char find(String str) {
		int max=0;
		HashMap<Character,Integer>map=new HashMap();
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		for(int val:map.values()) {
			if(val>max) {
				max=val;
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==max) {
				return entry.getKey();
			}
		}
		return (Character) null;
		
	}
	
	public static void main(String[] args) {
		System.out.println(find("takeuforward"));
	}

}
