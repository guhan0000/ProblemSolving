import java.util.*;
public class AbsoluteDifference {
	
	static int findCount(int arr[],int len,int num,int diff)
	{
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(Math.abs(arr[i]-num)<=diff)
			{
				count++;
			}
		}
		if(count>0)
		{
			return count;
		}
		else
		{
			return -1;
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]={12,77,13};
		int len=arr.length;
		int num=13;
		int diff=2;
		
		String arr1=Arrays.toString(arr);
		
		//System.out.println(arr[0]=100);
		System.out.println(arr[0]);
		
		
		//System.out.println(findCount(arr,len,num,diff));
		
		
	}
}
