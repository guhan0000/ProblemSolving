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
		
		
//		reverse w/o using new srting
		
		String firstName="Guhan";
		char[] firstNameArr=firstName.toCharArray();
		char temp;
		int n=firstName.length();
		int j=n-1;
		for(int i=0;i<n/2;i++) {
			temp=firstNameArr[i];
			firstNameArr[i]=firstNameArr[j];
			firstNameArr[j]=temp;	
			j--;
		}
		System.out.println(new String(firstNameArr));
		
	}

}
