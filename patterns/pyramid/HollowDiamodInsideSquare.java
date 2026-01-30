package patterns.pyramid;
//**********
//****  ****
//***    ***
//**      **
//*        *
//*        *
//**      **
//***    ***
//****  ****
//**********

public class HollowDiamodInsideSquare {
	public static void main(String[] args) {
		int n=5;
		char star='*';
		char space=' ';
		for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-(i-1);j++) {
					System.out.print(star);
				}
				for(int k=1;k<=(2*i)-2;k++) {
					System.out.print(space);
				}
				for(int l=n+i-1;l<2*n;l++) {
					System.out.print(star);
				}
				System.out.println();
			}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(star);
			}
			for(int k=1;k<=(2*n)-(2*i);k++) {
				System.out.print(space);
			}
			for(int l=(2*n)-i;l<2*n;l++) {
				System.out.print(star);
			}
			System.out.println();
		}
			
		}
	}


