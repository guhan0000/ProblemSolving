package strings;

import java.util.Scanner;

public class SubStringCheck {
	
	public static int check(String text,String pattern) {
		return text.indexOf(pattern);
	}

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter text");
		String text=scanner.nextLine();
		System.out.println("enter pattern");
		String pattern=scanner.nextLine();
		System.out.println(text);
		System.out.println(pattern);
		boolean contains = text.contains(pattern);
		System.out.println(contains);
		System.out.println(text.indexOf(pattern));
		System.out.println(check(text,pattern));
	}
	
}
