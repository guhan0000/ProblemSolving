import java.util.*;
public class BinaryToDecimal {
	static int compute(int n)
	{
		if(n==0)
		{
			return -1;
		}
		else
		{
			int base=1;
			int sum=0;
			while(n!=0)
			{
				int rem=n%10;
				sum=sum+(rem*base);
				base*=2;
				n/=10;
			}
			return sum;
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(compute(n));
	}

}
