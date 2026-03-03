package numbers;

public class SumOfGP {
	public static void main(String[] args) {
		int a=2;
		int r=3;
		int n=5;
		int sum=0;
		if(r==1) {
			sum=n*a;
		}
		else {
			sum=(int) (a*(Math.pow(r,n)-1))/(r-1);
		}
		System.out.println(sum);
	}
}
