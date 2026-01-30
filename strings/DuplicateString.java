package strings;

public class DuplicateString {
	public static void main(String[] args) {
		String string="cafsinfotech";
		char ch[]=string.toCharArray();
		int count[]=new int[26];
		for(char character:ch) {
			count[character-'a']++;
		}
		for(int i=0;i<count.length;i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println();
		for(int i=0;i<count.length;i++) {
			if(count[i]>1) {
				System.out.println((char)(i+'a')+"->"+count[i]);
			}
		}
		
	}

}
