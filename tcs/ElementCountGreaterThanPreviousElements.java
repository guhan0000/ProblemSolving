package tcs;

public class ElementCountGreaterThanPreviousElements {
	
	
	public static void main(String[] args) {
		
		int arr[]={3,4,5,8,9};
		int count=0;
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>max) {
				max=num;
				count++;
			}
		}
		System.out.println(count);
	}

}
