package patterns.pyramid;
//    *
//   ***
//  *****
// *******
//*********

public class EquilateralTriangle {
	public static void main(String[] args) {
		int n=5;
		char space=' ';
		char star='*';
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(space);
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print(star);
			}
//			for(int l=1;l<=n-i;l++) {
//				System.out.print(space);
//			}
			System.out.println();
		}
	}

}
