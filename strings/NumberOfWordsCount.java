package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input:  "Java is very easy"
//Output: 4

public class NumberOfWordsCount {
	static int wordCount(String str) {
		str=str.trim();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if((i==0 && str.charAt(i)!=' ')||(str.charAt(i)!=' ' && str.charAt(i-1)==' ')) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str="Java is    easy     ";
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
		System.out.println(split.length);
		System.out.println(wordCount(str));
	}

}
