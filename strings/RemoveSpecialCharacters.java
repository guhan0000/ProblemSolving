package strings;

public class RemoveSpecialCharacters {
	static String removeSpecialChars(String str) {
		str=str.trim();
		StringBuilder result=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				result.append(ch);
			}
			else if(ch==' ') {
				result.append(ch);
			}
			else if(ch>='0' && ch<='9') {
				result.append(ch);
			}
		}
		return result.toString();
		
	}
	public static void main(String[] args) {
		String str="Ja@va# 123!!";
		System.out.println(removeSpecialChars(str));
	}
	
}
