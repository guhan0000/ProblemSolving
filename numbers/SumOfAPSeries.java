package numbers;
import java.util.*;

public class SumOfAPSeries {
	
	public static void getAPSum(int arr[]) {
//		int j=0;
//		int index=0;
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]-arr[i+1]+" ");
			
		}
//		while(j<arr.length) {
//			if(index<arr.length && index>=0) {
//				System.out.println(arr[index++]-arr[index]);
//			}
//			j++;
//		}
	}
	
	public static void main(String[] args) {
		int a=1;
		int n=5;
		int d=1;
		int sum=n*(2*a+(n-1)*d)/2;
		System.out.println(sum);
		int arr[]= {2,5,8,11,14,17};
		getAPSum(arr);
	}
}
