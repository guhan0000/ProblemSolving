package tcs;
import java.util.*;
public class Zoo {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int l=scanner.nextInt();
		int a1=(l-(2*n))/2;
		int a2=n-a1;
		if(a1>0 && a2>0 && l>=2*n && l%2==0) {
			System.out.println("TL: "+a2);
			System.out.println("FL: "+a1);
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
	}

}
