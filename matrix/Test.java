package matrix;
import java.util.*;
public class Test {
	
	
	public static void main(String[] args) {
		int arr[][]=new int[1][5];
		arr[0][0]=1;
		arr[0][1]=3;
		arr[0][2]=5;
		arr[0][3]=7;
		arr[0][4]=11;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
