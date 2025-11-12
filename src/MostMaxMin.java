
public class MostMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,1,3,5,7,9,2,4,8,9};
		int res[]=new int[arr.length];
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<=arr[i])
			{
				res[i]=max;
			}
				
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
