package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinimumScalarProductOfTwoVectors {
	public static void main(String[] args) {
		Integer arr1[]= {10, 30, 40, 20};
		Integer arr2[]= {2,4,5,1};
		int prod=0;
//		Integer res[]=new Integer[arr1.length];
		Arrays.sort(arr1);
		Arrays.sort(arr2,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr1.length;i++) {
			prod=prod+(arr1[i]*arr2[i]);
		}
		System.out.println(prod);
	}

}
