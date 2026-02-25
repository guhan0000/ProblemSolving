package searching;
import java.util.*;
public class BinarySearch {
	
	public static int search(int arr[],int target) {
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,3,5,7,9,11};
		System.out.println(search(arr,7));
		
		
	}

}
