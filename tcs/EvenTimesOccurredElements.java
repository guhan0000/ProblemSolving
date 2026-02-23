package tcs;

import java.util.HashMap;
import java.util.Map;

public class EvenTimesOccurredElements {
	
	public static void getElements(int N,int L[]) {
		
		HashMap<Integer,Integer>map=new HashMap();
		for(int i=0;i<N;i++) {
			if(map.containsKey(L[i])) {
				map.put(L[i],map.get(L[i])+1);
			}
			else {
				map.put(L[i],1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer,Integer>entry:map.entrySet()){
			if(entry.getValue()%2==0) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}
	public static void main(String args[]) {
		int arr[]= {1,1,2,3,5,0,2,5,5,7,7};
		int len=arr.length;
		getElements(len,arr);
	}

}
