package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortCharacters {
	
	public static String sortCharacters(String str) {
		return"";
	}
	
	public static void main(String args[]) {
		String str="geeksforgeeks";
		StringBuilder result=new StringBuilder();
		char strArr[]=str.toCharArray();
		Stream.of(strArr).sorted().forEach(n->System.out.println(n));
//		System.out.println(result);
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		System.out.println(new String(strArr));
		System.out.println(strArr.toString());
//		System.out.println(new String('c'));
		
	}

}
