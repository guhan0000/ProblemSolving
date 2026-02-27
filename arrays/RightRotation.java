package arrays;
import java.util.*;
public class RightRotation {
	
	public static int[] rightRotate(int arr[],int k) {
		int n=arr.length;
		k=k%n;
		int index=0;
		int res[]=new int[n];
		for(int i=k+1;i<n;i++) {
			res[index++]=arr[i];
		}
		for(int i=0;i<=k;i++) {
			res[index++]=arr[i];
		}
		return res;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,3,5,7,11};
		System.out.println(Arrays.toString(rightRotate(arr, 2)));
	}

}
