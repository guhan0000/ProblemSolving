package strings;

import java.util.HashMap;

public class FrequencyOfEachCharacters {
	
	private static HashMap<Character, Integer> findFrequency(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String string="malayalam";
		int count[]=new int[26];
		char[] charArray = string.toCharArray();
		for(char ch:charArray) {
			count[ch-'a']++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.println((char)(i+'a') +"->"+count[i]);
			}
		}
		System.out.println(findFrequency(string));
	}

}
