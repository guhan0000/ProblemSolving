package tcs;
import java.util.*;
public class ExtractLargestSpecificNum {
	
	public static long getNumber(String str) {
		String split[]=str.split("\\s+");
		long max=-1;

		for(String word:split) {
			if(Character.isDigit(word.charAt(0))) {
			
				if(!word.contains("9")) {
					long num=Long.parseLong(word);
					if(num>max) {
						max=num;
					}
				}
		}
			
		}
		return max;
	}
	
	public static void multipleCases(String str[],int n) {
		for(int i=0;i<n;i++) {
			long max=-1;
			String split[]=str[i].split("\\s+");
			for(String word:split) {
//				if(Character.isDigit(word.charAt(0))) {
				if(word.matches("\\d+")) {
					if(!word.contains("9")) {
						long num=Long.parseLong(word);
						if(num>max) {
							max=num;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
//		String str=scanner.nextLine();
//		System.out.println(getNumber(str));
		System.out.println("enter N");
		int n=scanner.nextInt();
		scanner.nextLine();
		String strArr[]=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter string "+i);
			strArr[i]=scanner.nextLine();
		}
		multipleCases(strArr, n);
	}

}
