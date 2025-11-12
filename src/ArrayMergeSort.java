import java.util.*;
public class ArrayMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,5,7,6,1};
		int arr2[]= {11,0,-9};
		int res[]=new int[(arr1.length+arr2.length)];
		
	for(int i=0;i<arr1.length;i++)
		{
		res[i]=arr1[i];
		}
	for(int i=0;i<arr2.length;i++)
	{
		res[arr1.length+i]=arr2[i];
	}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
Arrays.sort(res);
for(int i=0;i<res.length;i++)
{
	System.out.println(res[i]);
}
	}
	

}
