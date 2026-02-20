package strings;

public class WagonCount {
	
	static void compute(int v,int w) {
		int car=0;
		int bike=0;
		if(v<2 || w%2!=0 || v>w) {
			System.out.println("Invalid");
		}
		else {
			car=(4*v-w)/2;
			bike=v-car;
			 System.out.println(car+" "+bike);
		}
	}
	public static void main(String[] args) {
		int v=200;
		int w=540;
		compute(v, w);
	}

}
