package tcs;

public class ToggleBinaryBits {
	
	public static void main(String[] args) {
		int n=100;
		String binaryString = Integer.toBinaryString(n);
		System.out.println(binaryString);
		String result="";
		for(char ch:binaryString.toCharArray()) {
			if(ch=='1') {
				result+='0';
			}else {
				result+='1';
			}
		}
		System.out.println(result);
		int int1 = Integer.parseInt(result);
		int base=1;
		int sum=0;
		while(int1>0) {
			int rem=int1%10;
			sum+=rem*base;
			base*=2;
			int1/=10;
		}
		System.out.println(sum);
	}
}
