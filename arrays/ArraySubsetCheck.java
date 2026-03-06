package arrays;

public class ArraySubsetCheck {
	
	public static void main(String[] args) {
		int arr[][]= {{10,20},{30,40},{20,10},{50,60}};
//		System.out.println(arr.length);o
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]) {
					System.out.println("("+arr[i][0]+","+arr[i][1]+") and ("+arr[j][0]+","+arr[j][1]+")");
				}
			}
		}
		
		
	}

}
