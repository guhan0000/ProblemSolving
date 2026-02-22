package tcs;

public class DecimalToBinary {
	
	public static void convert(int num) {
		String result="";
		while(num>=1) {
			System.out.println("loop");
			int temp=num%2;
			result=temp+result;
			num/=2;
		}
		int int1 = Integer.parseInt(result);
		System.out.println(result);
	}

	public static void main(String[] args) {
		convert(101);
	}
}
