import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6};
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				result=result+"Even ";
			}
			else
			{
				result=result+"Odd ";
			}
		}
		System.out.println(result);
	}
}
