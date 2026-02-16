package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// i/p: a3b5c2a2 
// o/p: aaabbbbbcc

public class StringExtraction {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		StringBuilder result=new StringBuilder();
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length()-1;i+=2) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+Character.getNumericValue(str.charAt(i+1)));
			}else {
				map.put(str.charAt(i), Character.getNumericValue(str.charAt(i+1)));
			}
			
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			for(int i=0;i<entry.getValue();i++) {
				result.append(entry.getKey());
			}
		}
		System.out.println(result);
	}
	

}
