package tcs;
import java.util.*;
public class SeatingArrangement {
	
	public static int factorial(int num) {
		if(num==0)
			return 1;
		return num*factorial(num-1);
	}
	
	public static void main(String[] args) {
		int n=10;
		System.out.println(factorial(2)*factorial(n-1));
	}
}
