import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		int num=10;
		int ans=0;
		int ans1=num;
		//int arr[]=new int[20];
		ArrayList<Integer> arr=new ArrayList<Integer>();
		//int i=0;
		while(num>0)
		{
			int rem=num%2;
			arr.add(rem);
			num/=2;
		}
		Collections.reverse(arr);
		System.out.println(arr);
		
	}
}
