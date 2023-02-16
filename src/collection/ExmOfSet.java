package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExmOfSet {

	public static void main(String[] args) {
		Integer[] a = { 22, 45, 33, 66, 55, 34, 77 };
		Integer[] b = { 33, 2, 83, 45, 3, 12, 55 };

		Set<Integer> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(a));

		Set<Integer> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(b));

		// Intersection Operation using addAll() returns common from two sets
		Set<Integer> intersection = new LinkedHashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intesection Set is " + intersection);

		// Union operation using addAll() returns set by removing repeated number from
		// two sets
		Set<Integer> union = new LinkedHashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union Set is " + union);

		// Difference operation using removeAll() returns unique numbers which are not
		// in another set
		Set<Integer> diff = new LinkedHashSet<>(set1);
		diff.removeAll(set2);
		System.out.println("Difference Set is " + diff);
		
		Set<Integer> containAll=new HashSet<>();
		containAll.add(33);
		containAll.add(55);
		containAll.add(55);
		System.out.println("Contains all ? "+set1.containsAll(containAll));
		System.out.println("Hashcode : "+containAll.hashCode());
		System.out.println("############________________________##############");
		
		List<Integer> list=Arrays.asList(10,22,12,14,16,14,19,22,4,5);
		SortedSet<Integer> hashset=new TreeSet<>();
		hashset.addAll(list);
		System.out.println("Sorted List converting into set : "+hashset);
	}

}
