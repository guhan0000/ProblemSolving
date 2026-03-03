package numbers;
import java.util.*;
public class ArmstrongNumberCheck {
	
	public static boolean isArmstrongNumber(int num) {
		int temp=num;
		String str=String.valueOf(num);
		int count=String.valueOf(num).length();
		int result=0;
		
		for(char ch:str.toCharArray()) {
			result+=Math.pow(ch-'0',count);
			
		}
		
		if(temp==result) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		System.out.println(isArmstrongNumber(123));
	}
}
