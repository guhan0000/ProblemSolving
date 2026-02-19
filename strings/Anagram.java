package strings;

public class Anagram {
	
	static boolean isAnagram(String str1,String str2) {
		// TODO Auto-generated method stub
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		int count[]=new int[26];
		for(char ch:charArray1) {
			count[ch-'a']++;
		}
		for(char ch:charArray2) {
			count[ch-'a']++;
		}
		for(int i=0;i<count.length;i++) {
			if(!(count[i]!=1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(isAnagram("sielnt", "listen"));
		
		
	}

}
