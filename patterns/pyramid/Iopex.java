package patterns.pyramid;

public class Iopex {
	public static void main(String[] args) {
		int n=5;
		patternX(n);
		char space=' ';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			for(int l=2;l<=i;l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		
	}

}
	   public static void patternX(int n) {
	        for (int row = 1; row <= n; row++) {
	            for (int space = 1; space <= (n - row); space++) {
	                System.out.print("  ");
	            }
	            for (int col = row; col >= 1; col--) {
	                System.out.print(col + " ");
	            }
	            for (int col = 2; col <= row; col++) {
	                System.out.print(col + " ");
	            }
	            System.out.println();
	        }
	    }
}
