package tcs;
import java.util.*;

public class Decryption {
	
	public static void main(String args[]) {
		char arr[]=new char[26];
		char value='a';
		for(int i=0;i<arr.length;i++) {
			arr[i]=value;
			value++;
		}
		System.out.println(Arrays.toString(arr));
		String msg="guhan";
		char msgArr[]=msg.toCharArray();
		String result="";
		for(char ch:msgArr) {
			result+=arr['z'-ch];
		}
		System.out.println(result);
		System.out.println('z'-'a');
		
	}

}
