package strings;

public class RemoveVowelsFromSentence {
	
	static String removeVowels(String str) {
		
		StringBuilder result=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if("aeiouAEIOU".indexOf(ch)==-1) {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(removeVowels(str));
	}

}
