package strings;

import java.util.Scanner;

public class CapitalizeWords {
	
	static String captitalize(String str) {
		str=str.toLowerCase().trim();
		
		StringBuilder result=new StringBuilder();
		String[] split = str.split("\\s+");
		for(String word:split) {
			if(word.length()==1 || word.length()==2) {
				result.append(word.toUpperCase());
				result.append(" ");
			}
			else {
				char firstLetter=Character.toUpperCase(word.charAt(0));
				char lastLetter=Character.toUpperCase(word.charAt(word.length()-1));
				String subString=word.substring(1,word.length()-1);
				result.append(firstLetter);
				result.append(subString);
				result.append(lastLetter);
				result.append(" ");
				
			}
		}
		
		return result.toString().trim();
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		System.out.println(captitalize(string));
}
}
