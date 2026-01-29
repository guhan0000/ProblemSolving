package patterns.pyramid;
//		
//		*
//	   * *
//	  *   *
//	 *     *
//	*********
public class HollowPyramid {
	public static void main(String[] args) {
		int n=5;
		char star='*';
		char space=' ';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(space);
			}
			for(int k=1;k<=(2*i)-1;k++) {
				if(k==1||k==(2*i)-1||i==n) {
					System.out.print(star);
				}
				else {
					System.out.print(space);
				}
				
			}
			System.out.println();
		}
		
	}

}
