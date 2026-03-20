package matrix;
import java.util.*;
public class StringInMatrixForm {
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		System.out.println(Math.sqrt(str.length()));
		int oldlen=(int)Math.ceil(str.length()/2);
		int len = (int)Math.ceil(Math.sqrt(str.length()));
//		if(str.length()%2!=0) {
//			len=(str.length()+1)/2;
//		}
//		else {
//			len=str.length()/2;
//		}
		int index=0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(index<str.length()) {
					System.out.print(str.charAt(index++)+" ");
				}
				else {
					System.out.print("X ");
				}
				
				
				
			}
			System.out.println();
		}
		System.out.println(len);
	}
	
}

//int cols = (int)Math.ceil(Math.sqrt(str.length()));
//int rows = (int)Math.ceil((double)str.length() / cols);
