package strings;

import java.util.*;
public class PangramString {
	
	public static int check(String str) {
		str=str.toLowerCase().trim();
		int freq[]=new int[26];
		for(char ch:str.toCharArray()) {
			if(ch!=' ') {
				freq[ch-'a']++;
			}
			
		}
		for(int i:freq) {
			if(i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String args[]) {
		String str="Pack my box with five dozen liquor jugs";
		System.out.println(check(str));
//		System.out.println(str.toLowerCase().trim());
	}

}
