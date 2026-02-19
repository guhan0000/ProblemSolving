package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWordsBasedOnLength {
	
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("apple","banana","orange","pineapple","kiwi");
		words.stream()
			.sorted((a,b)->a.length()-b.length())
			.forEach(System.out::println);
		System.out.println("****************************");

//		Conversion of list to primitive array using streams
		
		List<Integer>list=Arrays.asList(1,3,5,7,11);
		int[] array = list.stream()
			.mapToInt(n->n.intValue())
			.toArray();
		for(int num:array) {
			System.out.println(num);
		}
		
		
		
	}
	

}
