package matrix;
import java.util.*;

public class Rotate90DegClockWise {
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int size = scanner.nextInt();
		int matrix[][]=new int[size][size];
		
//		scanning i/p
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		
//		displaying original matrix
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("******************************");
//		rotation
		for(int i=0;i<size;i++) {
			for(int j=size-1;j>=0;j--) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}

}
