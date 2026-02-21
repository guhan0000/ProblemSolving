package strings;

public class ReverseString {
	
	public static String reverse(String str) {
		StringBuilder result =new StringBuilder(str);
		
		return result.reverse().toString();
		
	}
	
	public static void main(String args[]) {
		System.out.println(reverse("hello world"));
		String str1="Java Program";
		String res="";
		for(char ch:str1.toCharArray()) {
			res=ch+res;
		}
		System.out.println(res);
		
	}

}
