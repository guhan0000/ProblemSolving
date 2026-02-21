package strings;

public class ReverseWords {

	static String reverseWords(String str) {
		str=str.trim();
		String[] words=str.split("\\s+");
		StringBuilder result=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			result.append(words[i]);
			result.append(" ");
		}
		return result.toString().trim();
	}
	
	public static void main(String[] args) {
		String str="I Love Java Programming";
		System.out.println(reverseWords(str));
		
	}
}
