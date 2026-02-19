import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DealershipProblem {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of dealerships");
		int dealerShipCount=scanner.nextInt();
		
		for(int i=0;i<dealerShipCount;i++) {
			
			int car=scanner.nextInt();
			int bike=scanner.nextInt();
			int totalTires=(car*4)+(bike*2);
			System.out.println(totalTires);
		}
		
		
	}

}
