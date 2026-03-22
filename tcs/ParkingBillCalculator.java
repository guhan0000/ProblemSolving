package tcs;
import java.util.Scanner;
public class ParkingBillCalculator {
	
	public static void main(String[] args) {
		
        System.out.println("enter n");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=0;
        for(int i=1;i<=n;i++){
            
            if(i>0 && i<=2){
            result+=100;
        }
        else if(i>2 && i<=5){
            result+=50;
        }
        else if(i>5){
            result+=20;
        }
            
        }
        System.out.println(result);
    }
}
