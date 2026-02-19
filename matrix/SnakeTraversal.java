package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SnakeTraversal {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size of matrix");
		int size=scanner.nextInt();
		int matrix[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.println("enter matrix values");
				matrix[i][j]=scanner.nextInt();
			}
		}
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<size;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<size;i++) {
			if(i%2==0) {
				for(int j=0;j<size;j++) {
					System.out.print(matrix[i][j]+" ");
				}
			}
			else {
				for(int j=size-1;j>=0;j--) {
					System.out.print(matrix[i][j]+" ");
				}
			}
			
			
		}
	}

}
