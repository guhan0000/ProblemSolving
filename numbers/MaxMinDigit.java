package numbers;

public class MaxMinDigit {
	
	public static void findMaxMinDigit(int num) {
		num=Math.abs(num);
		int max=Integer.MIN_VALUE;;
		int min=Integer.MAX_VALUE;
		while(num>0) {
			int digit=num%10;
			max=Math.max(digit,max);
			min=Math.min(digit,min);
			num/=10;
		}
		System.out.println(max);
		System.out.println(min);
		
	}
	public static void main(String args[]) {
		int num=-200;
		findMaxMinDigit(num);
	}
	
}
