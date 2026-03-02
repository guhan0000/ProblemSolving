package arrays;

public class EquilibriumIndex {
	
	public static int getIndex(int arr[]) {
		
		int totalSum=0;
		int leftSum=0;
		for(int num:arr) {
			totalSum+=num;
		}
		for(int i=0;i<arr.length;i++) {
			totalSum-=arr[i];
			if(totalSum==leftSum) {
				return i;
			}
			leftSum+=arr[i];
		}
		
		
		return -1;
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3};
		System.out.println(getIndex(arr));
	}

}
