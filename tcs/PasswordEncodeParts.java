package tcs;
import java.util.*;
public class PasswordEncodeParts {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int len=str.length();
        int k=(int)Math.ceil(Math.sqrt(len));
        System.out.println(k);
        List<StringBuilder>temp=new ArrayList<>();
        for(int i=0;i<k;i++){
            temp.add(new StringBuilder());
        }
        // System.out.println(temp+" "+temp.size());
        for(int i=0;i<len;i++){
            temp.get(i%k).append(str.charAt(i));
        }
        List<String>list=new ArrayList<>();
        for(StringBuilder sb:temp){
            list.add(sb.toString());
        }
        System.out.println(list);
	}	
	
}
