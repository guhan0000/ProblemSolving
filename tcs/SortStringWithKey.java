package tcs;
import java.util.*;

public class SortStringWithKey {
	
	public static String sortString(String s,String key) {
		StringBuilder result=new StringBuilder();
		HashMap<Character,Integer> map=new HashMap();
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		for(char ch:key.toCharArray()) {
			if(map.containsKey(ch)) {
				for(int i=0;i<map.get(ch);i++) {
					result.append(ch);
				}
			}
			map.remove(ch);
		}
//		add remaining chars
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			result.append(entry.getKey());
		}
		return result.toString();
	}
	
	public static void main(String args[]) {
		System.out.println(sortString("applez","eapl"));
	}

}
