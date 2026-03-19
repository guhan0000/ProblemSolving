package matrix;

public class LowerTriangle {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,3,2},{1,3,5}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i>=j) {
					System.out.print(arr[i][j]);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
