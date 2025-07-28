import java.util.*;
public class ChocolateDistribution {

	
	public static void main(String[] args) {
		int arr[] = {7, 3, 2, 4, 9, 12, 56}; 
		int m = 3;
		int result=0;
		if(arr.length==0||m==0)
		{
			result=0;
		}
		Arrays.sort(arr);
		int minDiff=Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++)
		{
			int j=i+m-1;
			if(j>=arr.length-1)
			{
				break;
			}
			int min1=arr[j]-arr[i];
			 minDiff=Math.min(minDiff, min1);
			
		}
		System.out.println(minDiff);
		/*for (int i : arr) {
			System.out.println(i);
		}*/
	}
}
