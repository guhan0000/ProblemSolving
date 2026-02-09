package strings;

public class LengthOfString {
	public static void main(String[] args) {
		String str="guhan is a good boy";
		int strLength=0;
		char[] charArray = str.toCharArray();
//		System.out.println(str.length());
		for(char ch:charArray) {
			strLength++;
		}
		System.out.println(strLength);
		System.out.println(str.length());
	}

}
