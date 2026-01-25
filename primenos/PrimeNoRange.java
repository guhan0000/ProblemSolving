package primenos;
import java.util.*;
public class PrimeNoRange {
	static boolean isPrime(int num) {
		if(num<=0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int start=scanner.nextInt();//2
		int end=scanner.nextInt();//10
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
