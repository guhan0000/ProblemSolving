package strings;
//Input:  "JaVa123"
//Output: "jAvA123"
public class CaseConversion {
	public static void main(String[] args) {
		String str="JaVa123";
		StringBuilder result=new StringBuilder();
		char c='J';
		System.out.println((char)((int)c+32));
		for(char ch:str.toCharArray()) {
			if((ch>='a' && ch<='z')){
				result.append((char)((int)ch-32));
			}
			else if (ch>='A' && ch<='Z') {
				result.append((char)((int)ch+32));
			}
			else {
				result.append(ch);
			}
		}
		System.out.println(result.toString());
		
	}

}
