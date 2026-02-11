package arrays;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumbersInArray {
	public static void main(String[] args) {
		int arr[]= {2,3,3,6,4,4,5,7,8,9};
		Set<Integer>set=new TreeSet<Integer>();
		int sum=0;
		for(int num:arr) {
			set.add(num);
		}
		for(int num:set) {
			sum+=num;
		}
		System.out.println(set);
		int n=set.size();
		int sumOfSeries=n*(n+1)/2;
		System.out.println(sumOfSeries);
		System.out.println(sumOfSeries-sum);
		
	}

}
