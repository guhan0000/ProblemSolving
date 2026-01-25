import java.util.*;
public class LeapYearOrNot {
	static boolean isLeapYear(int year) {
		return (year%400==0)?true:(year%4==0 && year%100!=0)?true:false;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		System.out.println(isLeapYear(year));
		
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
