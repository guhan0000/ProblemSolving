package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDisjointOrNot {
	
	static boolean isDisjoint(int arr1[],int arr2[]) {
		int len1=arr1.length;
		int len2=arr2.length;
//		int minLen=Math.min(len1, len2);
//		for(int i=0;i<len1;i++) {
//			for(int j=0;j<len2;j++) {
//				if(arr1[i]==arr2[j]) {
//					return false;
//				}
//			}
//		}
//		return true;
//		optimized
		Set<Integer> set=new TreeSet<Integer>();
		
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {4,1,9};
		System.out.println(isDisjoint(arr1, arr2));
		
	}
}
