package strings;

public class MaxSignal {
	
	public static int getMaxSignal(String str) {
		
		int count=0;
		int max=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1') {
				count+=1;
				if(count>max) {
					max=count;
				}
			}
			else {
				count=0;
			}
		}
		return max;
	}
	public static void main(String args[]) {
		String str="1011000111101";
		System.out.println(getMaxSignal(str));
		
	}

}
