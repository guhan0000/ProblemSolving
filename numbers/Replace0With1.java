package numbers;
import java.util.*;

public class Replace0With1 {
		
		public static int replace0with1(int num) {
			String str=String.valueOf(num);
			
			return Integer.valueOf(str.replace("0","1"));
		}
		
		public static void main(String args[]) {
			int num=-101;
			System.out.println(replace0with1(num));
		}
}
