package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySubsetOrNot {
	
	public static boolean alternateSoln(int arr1[],int arr2[]) {
		boolean found=false;
		for(int i=0;i<arr2.length;i++) {
			found=false;
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					found=true;
					break;
				}
			}
		}
		return found;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr1[]= {4,1,3,2};
		int arr2[]= {3,4};
//		Set set=new HashSet<Integer>();
//		for(int i:arr2) {
//			set.add(i);
//			
//		}
//		boolean res = set.retainAll(Arrays.asList(arr1));
//		System.out.println(res);
		System.out.println(alternateSoln(arr1, arr2));
	}

}
