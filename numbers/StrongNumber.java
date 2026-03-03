package numbers;
import java.util.*;
public class StrongNumber {
	
	public static int factorial(int num) {
		int fact=1;
		if(num==0) {
			return fact;
		}
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
		
	}
	public static boolean isStrongNumber(int num) {
		int temp=num;
		int factSum=0;
		while(num>0) {
			int digit=num%10;
			
			factSum+=factorial(digit);
			num/=10;
		}
		if(temp==factSum) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(isStrongNumber(145));
	}

}
