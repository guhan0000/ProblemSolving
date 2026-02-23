package tcs;
import java.util.*;
public class FindCenturies {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		int result=0;
		if(year%100==0) {
			result=year/100;
		}else {
			result=year/100+1;
		}
		System.out.println(result);
		System.out.println(99%100);
		System.out.println(99/100);
		
		
	}

}
