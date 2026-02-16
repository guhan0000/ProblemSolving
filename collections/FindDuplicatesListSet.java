package collections;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesListSet {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,3,2,4,3,5);
		Set<Integer>set=new HashSet<Integer>();
//		boolean b = set.add(10);
//		System.out.println(b);
//		System.out.println(set.add(10));
		for(int i:list) {
			if(set.contains(i)) {
				System.out.println(i);
			}
			else {
				set.add(i);
			}
		}
	}

}
