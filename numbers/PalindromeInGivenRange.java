package numbers;
import java.util.*;
public class PalindromeInGivenRange {
	
	public static boolean isPalindrome(int num) {
		String str=String.valueOf(num);
		String reversed=new StringBuilder(str).reverse().toString();
		if(str.equals(reversed)) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		int start=100;
		int end=200;
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
