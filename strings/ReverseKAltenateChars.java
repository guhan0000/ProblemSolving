package strings;
import java.util.*;
public class ReverseKAltenateChars {
	
	public static void main(String args[]) {
		String str="abcde";
//		eegksfgroeeks
		StringBuilder result=new StringBuilder();
		int k=2;
		int start=0;
		int n=str.length();
		while(start<n) {
			int end=Math.min(start+k,n);
			String part=str.substring(start,end);
			result.append(new StringBuilder(part).reverse());
			start+=k;
			if(start<n) {
				end+=k;
				result.append(str.substring(start,end));
				start+=k;
			}
		}
		System.out.println(result.toString());
	}

}
