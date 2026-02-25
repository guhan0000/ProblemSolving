package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class MarketingCommission {
	
	public static void getDetails(String parent,char hasChildren,String children) {
		double parentCommision=0;
		double childCommission=0;
		String childSplit[]=children.split(",\\s+");
//		int childrenCount=0;
		int childrenCount=childSplit.length;
		if(hasChildren=='Y') {
			
			parentCommision=childSplit.length*(5000*0.1);
			childCommission=Math.round(5000*0.05);
			
			
		}
		else {
			childrenCount=0;
			parentCommision=Math.round(5000*0.05);
			
		}
		
		System.out.println("TOTAL MEMBERS: "+(childrenCount+1));
		System.out.println("COMMISSION DETAILS");
		System.out.println(parent+": "+parentCommision+" INR");
		if(hasChildren=='Y') {
			for(String child:childSplit) {
				System.out.println(child+": "+childCommission+" INR");
			}
		}
		
	}
	
	public static void main(String args[]) {
//		String str="Rajesh";
//		String[] split = str.split("\\,\\s+");
//		System.out.println(5000*((double)10/100));
//		System.out.println(Math.round(500.0));
//		
//		for(String name:split) {
//			System.out.println(name);
//		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter parent");
		String parent=scanner.nextLine();
		System.out.println("has children");
		char hasChildren=scanner.nextLine().charAt(0);
		String children="";
		if(hasChildren=='Y') {
			System.out.println("enter children");
			 children=scanner.nextLine();
		}
		getDetails(parent, hasChildren, children);
		
	}

}
