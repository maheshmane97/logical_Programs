  package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class PracticeOnListExamples {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Mahesh", 20000, "Sangli", 25));
		list.add(new Employee(3, "Yogesh", 24000, "Tasgaon", 23));
		list.add(new Employee(2, "Manoj", 25600, "Pune", 26));
		list.add(new Employee(4, "Suraj", 22300, "Baner", 28));
		System.out.println("###### Employee List : ");
		for (Employee e : list) {
			System.out.println(e);
		}

		Map<String, Long> collect = list.stream().collect(Collectors.toMap(k -> k.getName(), v -> v.getSalary()));
		System.out.println("###### Employee wrt Name & Salary");
		System.out.println(collect);

		List<Entry<String, Long>> list2 = collect.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();
		System.out.println("###### Sorted Employee acc to their Name");
		System.out.println(list2);

		List<Entry<String, Long>> list3 = collect.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).toList();
		System.out.println("###### Reversed Sorted Employee : ");
		System.out.println(list3);

		List<Entry<String, Long>> list4 = collect.entrySet().stream().filter(e -> e.getKey().startsWith("M")).toList();
		System.out.println("###### Startes with letter ");
		System.out.println(list4);

		long count = collect.entrySet().stream().count();
		System.out.println(count);

		List<Entry<String, Long>> list5 = collect.entrySet().stream()
				.filter(x -> x.getKey().startsWith("M") && x.getValue() == 20000).toList();
		System.out.println("###### Filters wrt to name and salary : ");
		System.out.println(list5);

		HashMap<String, Long> orderMapKey = new LinkedHashMap<>();
		collect.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> orderMapKey.put(x.getKey(), x.getValue()));
		System.out.println("###### Employee asc sorted by key in Hashmap : ");
		System.out.println(orderMapKey);

		HashMap<String, Long> orderMapValue = new LinkedHashMap<>();
		collect.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> orderMapValue.put(x.getKey(), x.getValue()));
		System.out.println("###### Employee asc sorted by Value in LHM : ");
		System.out.println(orderMapValue);

		HashMap<String, Long> revOrderKey = new LinkedHashMap<String, Long>();
		collect.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEachOrdered(x -> revOrderKey.put(x.getKey(), x.getValue()));
		System.out.println("###### Employee desc ssorted by key in LHM");
		System.out.println(revOrderKey);

		HashMap<String, Long> revOrderValue = new LinkedHashMap<String, Long>();
		collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> revOrderValue.put(x.getKey(), x.getValue()));
		System.out.println("###### Employee desc ssorted by Value in LHM");
		System.out.println(revOrderValue);

		String collect2 = collect.entrySet().stream().filter(k -> k.getValue() > 20000).map(Map.Entry::getKey)
				.collect(Collectors.joining(", "));
		System.out.println("Printed Employee names which had salary greater than 10k : ");
		System.out.println(collect2);

		System.out.println("###### Increase salary of employee had age greater than 23 : ");
		List<Employee> list6 = list.stream().map(x -> {
			if (x.getAge() > 25) {
				x.setSalary((long) (x.getSalary() * 1.5));
			}
			return x;
		}).toList();
		for(Employee e: list6) {
			System.out.println(e);
		}
		
		//Iterate map 
		System.out.println("###### Iterate by using for and Map.entry && entryset()");
		for(Map.Entry<String, Long> e: collect.entrySet()) {
			System.out.println(e);
		}
		
		System.out.println("###### Using Iterator");
		Iterator<Entry<String, Long>> i = collect.entrySet().iterator();
		if(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
