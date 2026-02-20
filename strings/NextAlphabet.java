package strings;

public class NextAlphabet {
	
	static String compute(String str) {
		StringBuilder result = new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch>='a' && ch<='z') {
				if(ch=='z') {
					result.append('a');
				}
				else {
					result.append((char)(ch+1));
				}
				
			}
			else if(ch>='A' && ch<='Z') {
				if(ch=='Z') {
					result.append('A');
					
				}else {
					result.append((char)(ch+1));
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String str="AzWZB";
		System.out.println(compute(str));
	}

}
