import java.util.*;
public class BillSharing {
	
	public static void BonAppetit(int bill[],int b,int k)
	{
		int share=0;
		for(int i=0;i<bill.length;i++)
		{
			if(i!=k)
			{
				share+=bill[i];
			}
		}
		if((share/2)==b)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(b-(share/2));
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int bill[]=new int[n];
		int k=scanner.nextInt();
		int b=scanner.nextInt();
		for(int i=0;i<bill.length;i++)
		{
			bill[i]=scanner.nextInt();
		}
		BonAppetit(bill, b, k);
		
		
		
	}
}
