import java.util.*;
public class BinaryOperations {
	static int compute(String str)
	{
		if(str == null || str.isEmpty())
		{
			return -1;
		}
		else
		{
			int result=str.charAt(0)-'0';
			char operation;
			int nextdigit=0;
			
			for(int i=1;i<str.length();i+=2)
			{
				operation=str.charAt(i);
				nextdigit=str.charAt(i+1)-'0';
				switch(operation)
				{
				case 'A':
					result=result&nextdigit;
					break;
				case 'B':
					result=result|nextdigit;
					break;
				case 'C':		
					result=result^nextdigit;
					break;
				default:
					return -1;
				}
				
			}
			return result;
		}
		
	}
	
public static void main(String[] args) {

	
	String str="";
	
	System.out.println(compute(str));
}
}
