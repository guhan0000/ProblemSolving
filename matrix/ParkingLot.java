package matrix;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
public class ParkingLot {
 public static void main(String[] args) {
     int index=0;
     Scanner scanner=new Scanner(System.in);
     int r=scanner.nextInt();
     int c=scanner.nextInt();
     int arr[][]=new int[r][c];
     for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
             arr[i][j]=scanner.nextInt();
         }
     }
     int maxCount=Integer.MIN_VALUE;
     
      for(int i=0;i<r;i++){
          int count=0;
         for(int j=0;j<c;j++){
             if(arr[i][j]==1){
                 count++;
             }
         }
         if(count>maxCount){
             maxCount=count;
             index=i;
         }
       
         
     }
     System.out.println(index);
 }
}