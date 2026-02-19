package strings;

import java.util.Arrays;

public class SuperASCII {
	
	static boolean isSuperAscii(String str) {
		int asciiArr[]=new int[26];
		int count[]=new int[26];
		for(int i=0;i<26;i++) {
			asciiArr[i]=i+1;
		}
		System.out.println("before");
		System.out.println(Arrays.toString(asciiArr));
		for(char ch:str.toCharArray()) {
			count[ch-'a']++;
			
		}
		for(char ch:str.toCharArray()) {
			if(!(count[ch-'a']==asciiArr[ch-'a'])) {
				return false;
			}
		}
		System.out.println("After");
		System.out.println(Arrays.toString(asciiArr));
		System.out.println(Arrays.toString(count));
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(isSuperAscii("ccc"));
		
	}

}
