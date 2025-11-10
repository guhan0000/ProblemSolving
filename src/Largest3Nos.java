import java.util.*;				
public class Largest3Nos {
	public static void main(String[] args) {
		int a=10,b=12,c=20
				
		int greatest=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println(greatest);
	}

}
