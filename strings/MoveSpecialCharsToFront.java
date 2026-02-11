package strings;

public class MoveSpecialCharsToFront {
	public static void main(String[] args) {
		String string="Hell@@oWo@rld@";
		StringBuilder chars=new StringBuilder();
		StringBuilder words=new StringBuilder();
		for(char ch:string.toCharArray()) {
			if(ch=='@') {
				chars.append(ch);
			}
			else {
				words.append(ch);
			}
		}
		chars.append(words);
		String result = chars.toString();
		System.out.println(result);
	}

}
