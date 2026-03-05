package arrays;
import java.util.*;
public class MaxInContigiousWindow {
	
	public static void compute(int arr[],int k) {
		ArrayList<Integer>list=new ArrayList<>();
		int index=0;
		while(k<=arr.length) {
			int max=Integer.MIN_VALUE;;
			for(int i=index;i<k;i++) {
				max=Math.max(max,arr[i]);	
			}
			list.add(max);
			index++;
			k++;
		}
		System.out.println(list);
	}
 	
	public static void main(String[] args) {
		int arr[]= {3, 1, 4, 1, 5};
		int k=5;
		compute(arr, k);
	}

}
