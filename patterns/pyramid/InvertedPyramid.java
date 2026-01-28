package patterns.pyramid;
//*********
// *******
//  *****
//   ***
//    *
public class InvertedPyramid {
	public static void main(String[] args) {
		int n=5;
		char star='*';
		char space=' ';
		for(int i=n;i>=1;i--) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(space);
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
