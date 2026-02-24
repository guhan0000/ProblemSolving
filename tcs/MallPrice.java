package tcs;

public class MallPrice {
	
	public static int getPrice(int N) {
		return 0;
	}
	
	public static void main(String[] args) {
		int num=1234;
		String string = Integer.toString(num);
		System.out.println(string);
		int sum=0;
		int prod=1;
		for(char ch:string.toCharArray()) {
			sum+=(ch-'0');
			prod*=(ch-'0');
		}
		System.out.println(sum);
		System.out.println(prod);
		int result=Math.abs(prod-sum);
		System.out.println(result);
	}

}
