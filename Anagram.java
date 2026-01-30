import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s1="code";
//		int n= (int)s.charAt(0);
//		System.out.println(n);
		String s2="docde";
		char[] charArray2 = s1.toCharArray();
		char[] charArray = s2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		boolean equals = Arrays.equals(charArray,charArray2);
		System.out.println(equals);
	}

}
