import java.util.*;
public class IcecreamParlor {
	public static void main(String[] args) {
		int m=6;
		int arr[]= {1,3,4,5,6};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]+arr[j]==m)
				{
					System.out.println((i+1)+" "+(j+1));
					
				}
			}
		}
	}

}
