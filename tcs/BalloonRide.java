package tcs;
import java.util.*;
public class BalloonRide {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String weights=scanner.nextLine();
		int y=scanner.nextInt();
		String[] split = weights.split("\\,\\s+");
//		System.out.println(Arrays.toString(split));
		int w[]=new int[n];
		int index=0;
		for(String s:split) {
			w[index++]=Integer.valueOf(s);
			
		}
//		System.out.println(Arrays.toString(w));
		Arrays.sort(w);
		int count=0;
		int capacity=0;
		for(int i=0;i<n;i++) {
			if(capacity+w[i]<=y) {
				count++;
				capacity+=w[i];
				
			}
			
			
		}
		System.out.println(count);
	}

}
