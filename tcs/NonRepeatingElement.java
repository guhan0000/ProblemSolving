package tcs;
import java.util.*;
public class NonRepeatingElement {
	
	public static void main(String[] args) {
		int arr[]= {2,23,23,2,4};
		int xor=0;
		for(int num:arr) {
			xor^=num;
		}
		System.out.println(xor);
	}

}
