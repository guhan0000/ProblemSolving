package arrays;

import java.util.Arrays;

public class LongestPalindromeArray {
	static boolean isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==temp) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {0,3432,5555,202,5,101};
		Arrays.sort(arr);
//		System.out.println(isPalindrome());
		int maxPalindrome=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(isPalindrome(arr[i])) {
//				if(maxPalindrome<arr[i]) {
					maxPalindrome=arr[i];
					break;
//				}
			}
			
		}
		System.out.println(maxPalindrome);
	}

}
