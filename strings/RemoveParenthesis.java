package strings;

public class RemoveParenthesis {
	
	static String compute(String str) {
		StringBuilder result = new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch!='(' && ch!=')') {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(compute("a(dewfAd)gkndfAD(("));
	}

}
