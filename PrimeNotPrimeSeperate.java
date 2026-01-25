import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNotPrimeSeperate {
	static boolean isPrime(int num) {
		if(num<=1) {
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
		List<Integer> list = Arrays.asList(1,3,5,7,13,4,56,78);
		List<Integer>primeList=new ArrayList();
		List<Integer>compostieList=new ArrayList();
		for(int num:list) {
			if(isPrime(num)) {
				primeList.add(num);	
			}
			else {
				if(num!=0&&num!=1) {
					compostieList.add(num);
				}
			}
		}
		System.out.println(primeList);
		System.out.println(compostieList);
		
		
		
	}

}
