package tcs;
import java.util.*;
public class VehicleFine {
	
	 public static int calculate(int n,int arr[],int d,int x){
	        int count=0;
	        boolean isDateEven=d%2==0?true:false;
	        if(isDateEven){
	            for(int i=0;i<n;i++){
	                if(arr[i]%2!=0){
	                    count++;
	                }
	            }
	        }
	        else{
	            for(int i=0;i<n;i++){
	                if(arr[i]%2==0){
	                    count++;
	                }
	            }
	        }
	        
	        return  count*x;        
	    }
	 public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	        int n=scanner.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=scanner.nextInt();
	        }
	        int d=scanner.nextInt();
	        int x=scanner.nextInt();
	        System.out.println(calculate(n,arr,d,x));
	    }

}
