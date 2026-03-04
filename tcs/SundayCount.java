package tcs;
import java.util.*;

public class SundayCount {
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String month=scanner.nextLine();
		int days=scanner.nextInt();
		String arr[]= {"sun","mon","tue","wed","thu","fri","sat"};
		int start=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(month)) {
				start=i;
				break;
			}
		}
		int count=0;
		for(int i=0;i<days;i++) {
			if(start==0) {
				count++;
			}
			start=(start+1)%6;
		}
		System.out.println(count);
		
	}
	
}
