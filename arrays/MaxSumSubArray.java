package arrays;
import java.util.*;

public class MaxSumSubArray {
	
	public static int bruteForce(int arr[]) {
		List<Integer>subArrays=new ArrayList<>();
		int maxSum=arr[0];
		for(int i=0;i<arr.length;i++) {
			subArrays.clear();
			int sum=0;
			
			for(int j=i;j<arr.length;j++) {
				subArrays.add(arr[j]);
				sum+=arr[j];
				maxSum=Math.max(sum,maxSum);
			}
			
			
		}
		System.out.println(subArrays);
		return maxSum;
		
	}
	
	public static void main(String args[]) {
		int arr[]= {2, -1, 2, 3, 4, -5};
		System.out.println(bruteForce(arr));
	}

}
