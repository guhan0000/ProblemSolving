package primenos;

public class Test {
	
	static int binaryToDecimal(int bin) {
		int base=1;
		int sum=0;
		while(bin>0) {
			int rem=bin%10;
			sum=sum+(base*rem);
			base*=2;
			bin/=10;
		}
		return sum;
	}
	
	static String decimalToBinary(int dec) {
		String bin="";
		while(dec>0) {
			bin=(dec%2)+bin;
			dec/=2;
		}
		return bin;
	}
	public static void main(String[] args) {
		System.out.println(decimalToBinary(10));
		System.out.println(binaryToDecimal(1000));
		
	}

}
