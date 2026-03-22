package tcs;
import java.util.*;
public class DiscountCalculation {
	
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int result=0;
       if(n<0){
           System.out.println("Error");
           return;
       }
       else if(n>0 && n<1000){
           result=(int)(n-(n*0.05));
       }
       else if(n>=1000 && n<=5000){
           result=(int)(n-(n*0.1));
       }
       else if(n>5000){
           result=(int)(n-(n*0.15));
       }
       System.out.println(result);
    }

}
