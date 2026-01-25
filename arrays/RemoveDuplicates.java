package arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int arr[]= {1,3,5,1,7,6,5};
		List<Integer> list=new ArrayList<>();
		for(int i:arr) {
			if(!list.contains(i)) {
				list.add(i);
			}
		}
		System.out.println(list);
		
	}
}
