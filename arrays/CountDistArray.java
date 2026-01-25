package arrays;

public class CountDistArray {
	static int distinctCount(int arr[]) {
		boolean visited[]=new boolean[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==true) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					
					
					
				}
				
			}
		count++;	
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {10, 30, 40, 20, 10, 20, 50, 10};
		System.out.println(distinctCount(arr));
	}

}
