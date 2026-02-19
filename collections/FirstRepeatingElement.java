package collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatingElement {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,5,10,1,4,3,5);
		Set<Integer>set=new LinkedHashSet<Integer>();
		for(int i:list) {
			if(set.contains(i)) {
				System.out.println(i);
				break;
			}
			else {
				set.add(i);
			}
		}
		
	}

}
