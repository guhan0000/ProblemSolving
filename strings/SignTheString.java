package strings;

public class SignTheString {

	static int validate(String str) {
		int hashCount=0;
		int starCount=0;
		
		for(char ch:str.toCharArray()) {
			if(ch=='#') {
				hashCount++;
			}
			else {
				starCount++;
			}
		}
		return hashCount-starCount;
		
	}
	
	public static void main(String[] args) {
		System.out.println(validate("#**#*"));
	}
}
