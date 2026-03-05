package matrix;
import java.util.*;


public class StudentResult {
	
	public static void getResult(int arr[][],int m,int n) {
		
		//calculate avg of marks
		int avgMarks[]=new int[n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				avgMarks[i]+=arr[j][i];
			}
			avgMarks[i]=avgMarks[i]/n;
		}
		int count=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]>=avgMarks[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("avg arr");
		System.out.println(Arrays.toString(avgMarks));
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}

		getResult(arr, m, n);
	}

}
