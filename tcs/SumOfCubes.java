package tcs;

public class SumOfCubes {
	
	
	public static int getCubeSum(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=Math.pow(i, 3);
		}
		
		System.out.println("****other**metod*****");
		int sum1=(int) Math.pow((end*(end+1))/2,2);
		int temp=start-1;
		int sum2=(int) Math.pow((temp*(temp+1))/2,2);
		System.out.println("result is"+(sum1-sum2));
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(getCubeSum(4, 9));
	
	}

}
