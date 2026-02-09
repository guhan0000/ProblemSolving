package strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Input:  "programming"
//Output: "progamin"
public class RemoveDuplicateChar {
	
	private static String removeFirstDuplicateChar(String str) {
		// TODO Auto-generated method stub
		Set<Character>set=new LinkedHashSet<Character>();
		for(char ch:str.toCharArray()) {
			set.add(ch);
		}
//		System.out.println(set);
		StringBuilder result=new StringBuilder();
		for(char ch:set) {
			result.append(ch);
		}
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		String str="programming";
		boolean seen[]=new boolean[26];
		StringBuilder result=new StringBuilder();
//		System.out.println(Arrays.toString(seen));
		for(char ch:str.toCharArray()) {
			if(!seen[ch-'a']) {
				seen[ch-'a']=true;
				result.append(ch);
				
			}
		}
//		System.out.println(result.toString());
		System.out.println(removeFirstDuplicateChar(str));
	}

}
