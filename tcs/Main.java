// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package tcs;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
       Set<String>seen=new HashSet<>();
       List<Integer>list=new ArrayList<>();
       int prevTime=-1;
        for(int i=0;i<n;i++){
            String sender=scanner.next();
            String receiver=scanner.next();
            int timeStamp=scanner.nextInt();
            int amount=scanner.nextInt();
            String key=sender+"-"+receiver;
            if(seen.contains(key)){
                System.out.print("Duplicate Record");
                return;
            }
            seen.add(key);
            if(prevTime!=-1 && prevTime-timeStamp>60){
                System.out.println("Fraud");
               return; 
            }
           prevTime=timeStamp;
         
        }
         System.out.println("All Valid");
     
    }
}