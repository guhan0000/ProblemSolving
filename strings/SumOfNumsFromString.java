package strings;

public class SumOfNumsFromString {
	
	public static int getSum(String str) {
		int sum=0;
		int num=0;
		for(char ch:str.toCharArray()) {
			if(Character.isDigit(ch)) {
				num=num*10+(ch-'0');
			}
			else {
				sum+=num;
				num=0;
			}
			
		}
		sum+=num;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(getSum("ab12cd3e45"));
		
		
	}

}
