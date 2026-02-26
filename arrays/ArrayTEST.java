package arrays;

public class ArrayTEST {
	
	public static void main(String[] args) {
		int arr[]= {1,3,5,7,11};
		int res[]=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
//			System.out.println("i : "+i);
//			System.out.println("arr["+i+"] : "+arr[i]);
//			System.out.println("index: "+index);
//			System.out.println("arr["+ index +"]: "+arr[index]);
//			index++;
////		System.out.println();
			System.out.println("before assign index "+index);
			res[index++]=arr[i];
			System.out.println("after assign index "+index);
			
		}
		
	}
}
