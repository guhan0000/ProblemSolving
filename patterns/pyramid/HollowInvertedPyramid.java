package patterns.pyramid;

//r.   *********
//      *     *
//       *   *
//        * *
//         *

public class HollowInvertedPyramid {
	public static void main(String[] args) {
		int n=10;
		char space=' ';
		char star='*';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(space);
			}
			for(int k=i;k<=2*n-i;k++) {
				if(k==2*n-i||k==i||i==1)
					System.out.print(star);
				else {
					System.out.print(space);
				}
			}
			
			System.out.println();
		}
	}

}
