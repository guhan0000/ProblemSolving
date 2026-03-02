package arrays;
import java.util.*;
public class SymmetricPairs {
	
	public static void main(String[] args) {
		System.out.println("enter no of pairs");
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("enter element");
				arr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
					if(arr[i][j]==arr[j][i]) {
						System.out.print(arr[i][j]);
					}
					System.out.println();
			}
			
		}
	}

}
