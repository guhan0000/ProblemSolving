import java.util.*;
public class PrimeNoFromList {
	
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num-1;i++) {
			if(num%i==0 ) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Prime from list");
		List<Integer> list = Arrays.asList(0,10,5,3,1,1);
		for(int num:list) {
			if(isPrime(num)) {
				System.out.println(num);
			}
		}
		
		
		
	}
}
