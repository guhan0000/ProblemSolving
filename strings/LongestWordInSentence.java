package strings;

import java.util.Arrays;

public class LongestWordInSentence {
	
	public static void main(String[] args) {
		String string="Java is a programming language.";
		string=string.trim();
		String[] split = string.split("\\s+");
		System.out.println(Arrays.toString(split));
		String longest="";
		for(String str:split) {
			if(str.length()>longest.length())	
				longest=str;
			
		}
		System.out.println(longest);
	}

}
