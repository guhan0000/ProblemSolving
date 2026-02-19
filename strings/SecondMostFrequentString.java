package strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SecondMostFrequentString {
	
	static String find(String arr[]) {
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		for(String str:arr) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}			
		}
		int firstMax=0;
		int secMax=0;
		String key="";
		for(int val:map.values()) {
			if(val>firstMax) {
				firstMax=val;
			}
		}
		
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			int val=entry.getValue();
			if(val>secMax && val<firstMax) {
				 key = entry.getKey();
			}
		}
		return key;
		
	}
	
	public static void main(String[] args) {
		String arr[]= {"aaa","bbb","ccc","bbb","aaa","aaa"};
		System.out.println(find(arr));
	}

}
