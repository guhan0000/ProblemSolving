package patterns.pyramid;
//* * * * *
// * * * *
//  * * *
//   * *
//    *
//    *
//   * *
//  * * *
// * * * *
//* * * * *
public class HourGlass {
	public static void main(String[] args) {
		int n=10;
		char star='*';
		char space=' ';
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(space);
			}
			for(int k=2*i-1;k>=1;k--) {
				System.out.print(star);
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(space);
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(star);
			}
			System.out.println();
		}
				
	}

}
