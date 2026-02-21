package strings;

public class WordCount {
	
	public static int getCount(String str) {
		str=str.trim();
		String words[]=str.split("\\s+");
		return words.length;
	}
	
	public static void main(String[] args) {
		System.out.println(getCount("I love Java Programming and I will become a Java Developer soon"));
	}

}
