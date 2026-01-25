package arrays;

public class MaxSubArrayProduct {
	public static void main(String[] args) {
		int arr[]= {2, 3, -2, 4};
		int maxSofar=arr[0];
		int minSoFar=arr[0];
		int result=arr[0];
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			if(curr<0) {
				int temp=maxSofar;
				maxSofar=minSoFar;
				minSoFar=temp;	
			}
			maxSofar=Math.max(curr, curr*maxSofar);
			minSoFar=Math.min(curr, curr*minSoFar);
			result=Math.max(result, maxSofar);	
		}
		System.out.println(result);
	}

}
