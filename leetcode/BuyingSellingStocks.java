package leetcode;

public class BuyingSellingStocks {
	static int soln(int arr[]) {
		int maxProfit=0;
		int minPrice=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(minPrice>arr[i]) {
				minPrice=arr[i];
			}
			if(maxProfit<arr[i]-minPrice) {
				maxProfit=arr[i]-minPrice;
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int prices[]= {7,6,4,3,1};
		System.out.println(soln(prices));
		
		
	}

}
