import java.nio.channels.IllegalBlockingModeException;

public class ShiftZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int arr[]= {5,0,6,8,0,2,0,7};
		int res[]=new int[arr.length];
		int index=0;
		for(int num:arr)
		{
			if(num==0)
			{
				res[index++]=0;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				res[index++]=arr[i];
			}
		}
		for(int num:res)
		{
			System.out.print(num+" ");
		}
		
	}

}
