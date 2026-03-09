package matrix;

public class ToeplitzMatrix {
	
	public static boolean isToeplitx(int arr[][]) {
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][j]!=arr[i-1][j-1]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
//		int arr[][]={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		int arr[][]= {{1,2},{2,1}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(isToeplitx(arr));
	}

}
