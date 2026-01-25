import java.util.*;
public class Test {
	public boolean validAnagram(String s,String t)
	{
		char sa[]=s.toCharArray();
		char ta[]=t.toCharArray();
		int count[]=new int[26];
		for(char ch :sa)
		{
			count[ch-'a']++;
		}
		for(char ch:ta)
		{
			count[ch-'a']--;	
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
			{
				return false;
			}
			
		}
		return true;
		
	}
public static void main(String[] args) {
//	char arr[]=new char[26];
//	//arr[0]++;
//	arr[0]='a';
//	arr[25]='z';
//	for(int i=0;i<arr.length;System.out.println(arr[i++]));
	/*String s="listen";
	String t="silent";
	Test t1=new Test();
	System.out.println(t1.validAnagram(s, t));*/
	ArrayList<Integer>arr=new ArrayList<Integer>();
	arr.add(120);
	arr.add(10);
	arr.add(120);
	int maxx=Collections.max(arr);
	System.out.println(maxx);
//	for(int num:arr)
//	{
//		System.out.println(num);
//	}
	
	
	
			
}
}
