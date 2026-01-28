package patterns.pyramid;
//o.    *
//	   ***
//	  *****
//	 *******
//	********* 
//	 *******
//	  *****
//	   ***
//	   	*  
public class Diamond {
	static void solution2(int n) {
		char space=' ';
		char star='*';
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(space);
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(space);
			}
			for(int j=2*i-1;j>=1;j--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		char star='*';
		char space=' ';
//		for(int i=1;i<=(n*2)-1;i++) {
//			int row=(i<=n)?i:(2*n-i);
//			
//				for(int k=1;k<=n-row;k++) {
//					System.out.print(space);
//				}
//				for(int j=1;j<=(2*row-1);j++) {
//					System.out.print(star);
//				}
//			
//			System.out.println();
//		}
		solution2(5);
	}

}
