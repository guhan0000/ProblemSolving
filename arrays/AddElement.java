package arrays;
import java.util.*;

public class AddElement {
	
	public static int[] addElement(int arr[],int element, Integer position ) {
		int size=arr.length;
		int res[]=new int[size+1];
		if(position==null || position>=size) {
			for(int i=0;i<size;i++) {
				res[i]=arr[i];
			}
			res[size]=element;
		}
		else {
			for(int i=0;i<position;i++) {
				res[i]=arr[i];
			}
			res[position]=element;
			for(int i=position;i<size;i++) {
				res[i+1]=arr[i];
			}
		}
		
		
		return res;
		
	}
	
	public static void main(String args[]) {
		
		int arr[]= {1,3,5,7};
		System.out.println(Arrays.toString(addElement(arr, 100,4)));
	}

}
