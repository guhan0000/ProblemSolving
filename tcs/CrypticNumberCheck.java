package tcs;
import java.util.*;
public class CrypticNumberCheck {

	 static boolean isPalindrome(int num){
	        String numStr=String.valueOf(num);
	        String reversed=new StringBuilder(numStr).reverse().toString();
	        if(String.valueOf(num).equals(reversed)){
	            return true;
	        }
	        return false;
	    }
	    
	    static boolean isRepeatDigit(int num){
	        Set<Integer>set=new HashSet<>();
	        
	        while(num>0){
	            int rem=num%10;
	            if(set.contains(rem)){
	                return true;
	            }
	            set.add(rem);
	            num/=10;
	        }
	        
	        return false;
	    }
	    
	    public static void main(String[] args) {
			ArrayList<Integer>list=new ArrayList();
			int start=70;
			int end=80;
			for(int i=start;i<=end;i++) {
				if((i%5!=0) && (i%7==0) && (!isPalindrome(i)) && (!isRepeatDigit(i))) {
					list.add(i);
				}
			}
			if(!list.isEmpty()) {
				for(int num:list) {
					System.out.print(num+" ");
				}
			}
			else {
				System.out.println(-1);
			}
		}
}
