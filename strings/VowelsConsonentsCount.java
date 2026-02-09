package strings;

public class VowelsConsonentsCount {
	public static void main(String[] args) {
		String str="Apple";
		str=str.toLowerCase();
		int vowels=0;
		int consonants=0;
//		boolean contains = str.contains("a");
//		System.out.println(contains);
//		System.out.println(str.charAt(0));
//		char charAt = str.charAt(0);
//		Character character=charAt;
//		System.out.println(character.getClass());
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				if("aeiou".indexOf(ch)!=-1) {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.println(vowels + " "+consonants);
	}

}
