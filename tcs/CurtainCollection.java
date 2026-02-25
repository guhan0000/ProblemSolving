package tcs;
import java.util.*;
public class CurtainCollection {
	
	public static int findMaxAquaColor(String str,int L) {
		int startIndex=0;
		int maxCount=-1;
		while(startIndex<str.length()) {
			int endIndex=Math.min(startIndex+L,str.length());
			String part=str.substring(startIndex,endIndex);
			int count=0;
			for(int i=0;i<part.length();i++) {
				if(part.charAt(i)=='a') {
					count++;
				}
			}
			maxCount=Math.max(maxCount,count);
			startIndex=endIndex;
		}
		return maxCount;
	}
	public static void main(String args[]) {
		String str="abbbaabbb";
		int L=5;
		System.out.println(findMaxAquaColor(str, L));
	}
}
