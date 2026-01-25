package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayIncreasingFreq {
	public static void main(String[] args) {
		int arr[]= {1,5,0,5};
		List<Integer>list=new ArrayList();
		for(int num:arr) {
			list.add(num);
		}
		Map<Integer, Integer>mapCount=new HashMap<Integer, Integer>();
		Map<Integer, Integer>mapIndex=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(mapCount.containsKey(arr[i])) {
				mapCount.put(arr[i],mapCount.get(arr[i])+1);
			}
			else {
				mapCount.put(arr[i], 1);
				mapIndex.put(arr[i],i);
			}
		}
		Collections.sort(list,new Comparator<Integer>() {
			public int compare(Integer n1,Integer n2) {
				int freq1=mapCount.get(n1);
				int freq2=mapCount.get(n2);
				if(freq1!=freq2) {
					return freq1-freq2;
				}
				else {
					return (n2)-(n1);
				}
			}
		});
//		System.out.println(mapCount);
//		System.out.println(mapIndex);
		System.out.println(list);
		

	}

}
