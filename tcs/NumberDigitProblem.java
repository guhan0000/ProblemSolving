package tcs;
import java.util.*;

public class NumberDigitProblem {
	
	public static int find(int n,int r) {
		
		if(r!=0) {
			String strN=String.valueOf(n);
			int sum=0;
			int result=0;
			char nArr[]=strN.toCharArray();
			for(int i=0;i<r;i++) {
				for(char ch:nArr) {
					sum+=ch-'0';
				}
			}
			while(sum>0) {
				int digit=sum%10;
				result+=digit;
				sum/=10;
			}
			return result;
		}
		return 0;
	}
	public static void main(String args[]) {
		int N=1234;
		int R=0;
		System.out.println(find(N, R));
	}
}
