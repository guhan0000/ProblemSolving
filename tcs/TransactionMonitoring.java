package tcs;
import java.util.*;
class Transaction{
	
	String sender;
	String receiver;
	int timeStamp;
	int amount;
	
	public Transaction(String sender,String receiver,int timeStamp,int amount) {
		this.sender=sender;
		this.receiver=receiver;
		this.timeStamp=timeStamp;
		this.amount=amount;
	}
	
	public String getSender() {
		return sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public int getTimeStamp() {
		return timeStamp;
	}
	public int getAmount() {
		return amount;
	}
}

public class TransactionMonitoring {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n=scanner.nextInt();
	        scanner.nextLine();
	       
	        
	        for(int i=0;i<n;i++){
	        	
	            String sender=scanner.next();
	            String receiver=scanner.next();
	            int timeStamp=scanner.nextInt();
	            int amount=scanner.nextInt();
	            Transaction transaction=new Transaction(sender,receiver,timeStamp,amount);
	            scanner.nextLine();
	        }
	        List<Transaction>transactions=new ArrayList<>();
	        Set<String>seen=new HashSet<>();
	        Map<String,Integer>timeMap=new HashMap<>();
//	        int prevTime=-1;
	        for(Transaction t:transactions) {
	        	String key1=t.getSender()+"-"+t.getReceiver();
	        	String key2=t.getReceiver()+"-"+t.getSender();
	        	if(seen.contains(key1) || seen.contains(key2)) {
	        		System.out.println("duplicate record");
	        		return;
	        	}
	        	seen.add(key1);
	        	if(timeMap.containsKey(key1)) {
	        		int prevTime=timeMap.get(key1);
	        		if(t.getTimeStamp()-prevTime<=60) {
	        			System.out.println("fraud");
	        			return;
	        		}
	        	}
	        	timeMap.put(key1,t.timeStamp);
	        }
	        System.out.println("All Valid");
	    }

}
