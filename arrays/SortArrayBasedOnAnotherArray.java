package arrays;
import java.util.*;
//ip
//arr1 = [7, 3, 9, 1, 5]
//arr2 = [5, 7]
//op
//[5, 7, 1, 3, 9]

public class SortArrayBasedOnAnotherArray {

	public static void sortArray(int arr1[],int arr2[]) {
		
		Map<Integer,Integer>map=new HashMap<>();
		for(int num:arr1) {
			if(map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}
			else {
				map.put(num,1);
			}
		}
		// printing in arr2 order
		for(int num:arr2) {
			if(map.containsKey(num)) {
				int freq=map.get(num);
				while(freq>0) {
					System.out.print(num+" ");
					freq--;
				}
				map.remove(num);
			}
		}
		List<Integer>remaining=new ArrayList<Integer>();
		remaining.addAll(map.keySet());
		Collections.sort(remaining);
		for(int num:remaining) {
			int freq = map.get(num);

            while (freq-- > 0) {
                System.out.print(num + " ");
            }
		}
		
	}
	
	public static void main(String args[]) {
		 int[] arr1 = {5, 3, 5, 7, 2, 3, 2};
	     int[] arr2 = {3,5};
	     sortArray(arr1, arr2);
	}
	
}
