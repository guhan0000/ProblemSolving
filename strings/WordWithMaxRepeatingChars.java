package strings;

public class WordWithMaxRepeatingChars {
	
	public static void find(String str) {
		str=str.toLowerCase();
		String words[]=str.split("\\s+");
		
		int maxRepeated=0;
		String result="";
		
		for(String word:words) {
			int freq[]=new int[26];
			int repeated=0;
			for(char ch:word.toCharArray()) {
				freq[ch-'a']++;
			}
			for(int count:freq) {
				if(count>1) {
					repeated++;
				}
			}
			if(repeated>maxRepeated) {
				maxRepeated=repeated;
				result=word;
			}
		}
		if(result.equals("")) {
			System.out.println("-1");
			return;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String str="abcde google microsoft";
		find(str);
	}

}
