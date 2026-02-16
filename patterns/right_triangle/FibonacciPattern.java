package patterns.right_triangle;

public class FibonacciPattern {
	
	public static void main(String[] args) {
		int n=5;
		int f1=0;
		int f2=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(f1+f2+" ");
				int temp=f1+f2;
				f2=f1;
				f1=temp;
				
				
			}
			System.out.println();
		}
	}

}
