package strings;

import java.util.Arrays;

public class RemoveCharsFromString {
	
	static String compute(String str1,String str2) {
		StringBuilder result=new StringBuilder();
		boolean remove[]=new boolean[256];
		for(char ch:str2.toCharArray()) {
			remove[ch]=true;
		}
		System.out.println(Arrays.toString(remove));
		for(char ch:str1.toCharArray()) {
			if(!remove[ch]) {
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
//		String str="guhan";
//		String str2="han";
//		StringBuilder result=new StringBuilder(str2);
//		System.out.println(result.reverse());
		System.out.println(compute("guhan", "ma"));
	}
	
}
