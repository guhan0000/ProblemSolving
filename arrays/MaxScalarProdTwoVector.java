package arrays;

import java.util.Arrays;

public class MaxScalarProdTwoVector {
	public static void main(String[] args) {
		Integer arr1[]= {10,30,50,40};
		Integer arr2[]= {50,40,10,20};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int prod=0;
		for(int i=0;i<arr1.length;i++) {
			prod=prod+(arr1[i]*arr2[i]);
		}
		System.out.println(prod);
	}

}
