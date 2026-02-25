package strings;
import java.util.*;

public class StringSplitting {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string");
		String str=scanner.nextLine();
		ArrayList<String>nameList=new ArrayList<>();
		while(true) {
			int commaIndex=str.indexOf(",");
			if(!str.contains(",")) {
				nameList.add(str.trim());
				break;
			}
			
			String name=str.substring(0,commaIndex);
			nameList.add(name);
			
			str=str.substring(commaIndex+1);
			
		}
		System.out.println(nameList);
	}

}
