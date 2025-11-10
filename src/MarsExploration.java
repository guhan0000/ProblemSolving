import java.util.*;
public class MarsExploration {
	

	public static void main(String[] args) {
		String s="SOSSOSSOS";
		int len=s.length();
		String res="";
		int count=0;
		for(int i=0;i<len;i+=3)
		{
			res=res+"SOS";
		}
//		System.out.println(res);	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=res.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}
}
