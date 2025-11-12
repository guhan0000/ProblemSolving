import java.util.*;
public class ArrayPosition {
	
	
	public static void main(String[] args) {
		int arr[]= {1,3,5,6,8,10};
		int length = arr.length;
		int target=20;
		int result=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(target<=arr[i])
			{
				result=i;
				break;
			}
			
		}
		System.out.println(result);
		
	}

}
