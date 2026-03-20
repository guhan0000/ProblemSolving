package matrix;
import java.util.*;
public class CheckUpperTriangle {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int matrix[][]= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
		System.out.print(matrix[i][j]+" ");
		
			}
			System.out.println();
		}
		boolean isUpperMatrix=true;
		boolean isLowerMatrix=true;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(i>j && matrix[i][j]!=0) {
					isUpperMatrix=false;
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(j>i && matrix[i][j]!=0) {
					isLowerMatrix=false;
				}
			}
		}
		System.out.println(isUpperMatrix);
		System.out.println(isLowerMatrix);
	}

}
