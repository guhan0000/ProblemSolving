package numbers;
import java.util.*;

public class Add2Fractions {
	
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	public static int[] add(int a[],int b[]) {
		
		int result[]=new int[2];
		int numerator=((a[0]*b[1])+(a[1]*b[0]));
		int denominator=a[1]*b[1];
		int gcd=gcd(numerator,denominator);
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		result[0]=numerator;
		result[1]=denominator;
		
		return result;
	}
	public static void main(String args[]) {
		int a[]= {1,2};
		int b[]= {3,2};
		System.out.println(Arrays.toString(add(a,b)));
		System.out.println(18/27);
	}

}
