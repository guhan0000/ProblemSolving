package strings;

import java.util.ArrayList;
import java.util.List;

public class MoveHashToFront {
	public static void main(String[] args) {
		String string="Move#Hash#to#Front";
		int length=string.length();
		char[]ch=string.toCharArray();
//		char res[]=new char[ch.length];
		List<Character>res=new ArrayList<Character>();
		List<Character>hashList=new ArrayList<Character>();
		System.out.println(ch);
		boolean contains = string.contains("#");
		int hashCount=0;
		
		System.out.println(contains);
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='#') {
				ch[i]='!';
				hashCount++;
			}
		}
		for(int i=0;i<hashCount;i++) {
			hashList.add('#');
		}
		
		for(char c:ch) {
			if(c!='!') {
				res.add(c);
			}
		}
		System.out.println(res);
		System.out.println(hashList);
		hashList.addAll(res);
		System.out.println(hashList);
		Object[] array = hashList.toArray();
		String finalString="";
		for(int i=0;i<hashList.size();i++) {
			finalString=finalString+array[i];
		}
		System.out.println(finalString);
		
	}

}
