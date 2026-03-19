package matrix;

public class UpperTriangle {
	
	public static void main(String[] args) {
		
		char space='*';
		int arr[][]= {{6,5,4},{1,2,5},{7,9,7}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(j>=i) {
					System.out.print(arr[i][j]);
				}else {
					System.out.print(" ");
				}
				
			}	
			System.out.println();
		}
	}

}
