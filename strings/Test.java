package strings;
import java.util.*;
public class Test {
//	Anthony#Edward#Stark@32
	static int hashCount(String string) {
		int hashCount=0;
		for(char ch:string.toCharArray()) {
			if(ch=='#') {
				hashCount++;
			}
		}
		return hashCount;
	}
	static int atCount(String string) {
		int atCount=0;
		for(char ch:string.toCharArray()) {
			if(ch=='@') {
				atCount++;
			}
		}
		return atCount;
	}
	static String replaceHashByDollar(String str) {
		StringBuilder result=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch=='#') {
				result.append('$');
			}
			else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	static void printNames(String str) {
//		str=str.toLowerCase();
//		StringBuilder firstName=new StringBuilder();
//		StringBuilder lastName=new StringBuilder();
		int first = str.indexOf('#');
//		System.out.println(first);
		String firstName = str.substring(0,first);
		System.out.println(firstName.toUpperCase());
		int second = str.indexOf('#',first+1);
//		System.out.println(second);
		int atIndex=str.indexOf('@');
		String lastName = str.substring(second+1,atIndex);
		System.out.println(lastName.toLowerCase());
		
	}
	static String replaceCharWithSpace(String str) {
		StringBuilder result=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')) {
				result.append(ch);
			}
			else {
				result.append(' ');
			}
		}
		return result.toString();
	}
	static String reversedFirstName(String str) {
		int first= str.indexOf('#');
		String result="";
				
		String substring = str.substring(0, first);
		for(int i=substring.length()-1;i>=0;i--) {
			result+=substring.charAt(i);
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		String string=scanner.next();
		System.out.println(string);
		System.out.println(hashCount(string));
		System.out.println(atCount(string));
		System.out.println(replaceHashByDollar(string));
		printNames(string);
		System.out.println(replaceCharWithSpace(string));
		System.out.println(reversedFirstName(string));
		System.out.println(string.contains("#"));
		String name="Guhan";
		StringBuilder result=new StringBuilder(name);
		result.append(' ');
		result.append("Muthuramalingam");
		System.out.println(result.toString());
		
	}

}
