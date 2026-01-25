package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySubsetOrNot {
	public static void main(String[] args) {
		int arr1[]= {1,1,0,2};
		int arr2[]= {1,2,3,4};
		Set set=new HashSet<Integer>();
		for(int i:arr2) {
			set.add(i);
			
		}
		boolean res = set.retainAll(Arrays.asList(arr1));
		System.out.println(res);
	}

}
