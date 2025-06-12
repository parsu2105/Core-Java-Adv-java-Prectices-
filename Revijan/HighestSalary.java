package com.Revijan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
	String name;
	int salary;

	public Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class HighestSalary {

	public static void main(String[] args) {
		List<Employee1> list = Arrays.asList(new Employee1("prashant", 200000), new Employee1("nishant", 300000),
				new Employee1("prakash", 4000000), new Employee1("ashish", 3020404), new Employee1("Rishav", 4030495));

		List<Employee1> higestSalary = list.stream().sorted((s1, s2) -> s1.salary - s2.salary)
				.collect(Collectors.toList());
		System.out.println(higestSalary);

		list.stream().filter(n -> n.salary > n.salary).map(n -> n.name).collect(Collectors.toList());

		List<Integer> num = Arrays.asList(8, 5, 4, 7, 7, 5, 4, 7, 8, 55, 2, 3, 6, 44);
		System.out.println(num.parallelStream().sorted(Comparator.reverseOrder()).skip(1).findFirst());

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumber = number.stream().filter(n -> n % 2 == 0).map(n -> n * 100)
				.collect(Collectors.toList());
		System.out.println(evenNumber);

		System.out.println(num.stream().sorted().collect(Collectors.toList()));
		System.out.println(num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println(num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

		num.stream().forEach(name -> System.out.println(name + "name"));
		
		num.stream().sorted().forEach(name -> System.out.println(name));
		
		num.stream().distinct().forEach(n -> System.out.println(n + "==REMOVE DUPLICATE"));
		
		num.stream().limit(3).forEach(n -> System.out.println(n + "-->Starting 3 Elements"));
		num.stream().skip(2).forEach(n -> System.out.println(n + "==after Skip"));
		num.stream().collect(Collectors.toSet()).forEach(n -> System.out.println(n + "-->This is the set element"));
		num.stream().skip(2).limit(3).forEach(n -> System.out.println(n));
		num.stream().skip(2).limit(3).forEach(n -> System.out.println(n));
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(4, 5), Arrays.asList(5, 6),
				Arrays.asList(34, 75), Arrays.asList(34, 78), Arrays.asList(23, 78));
		listOfLists.stream().flatMap(List::stream).forEach(n -> System.out.println(n + "this is element"));

		List<List<String>> listOfFruit = Arrays.asList(Arrays.asList("mango", "orange"),
				Arrays.asList("Tamato", "pinaple"), Arrays.asList("Apple", "chicku"),
				Arrays.asList("Lemon", "watermelon"));
		listOfFruit.stream().flatMap(List::stream).forEach(n -> System.out.println(n));

		List<List<String>> s1 = Arrays.asList(Arrays.asList("PRASHANT", "KUMAR"), Arrays.asList("KUNAL", "KUSHWAHA"),
				Arrays.asList("Aniket", "Panday"), Arrays.asList("Kundan", "KUMAR"));
		s1.stream().flatMap(List::stream).forEach(s -> System.out.println(s));

		List<List<String>> s2 = Arrays.asList(Arrays.asList("TAble", "Chair"), Arrays.asList("BENCH", "PEN"),
				Arrays.asList("LAPTOP", "BOOK"), Arrays.asList("WATCH", "Phone"));
		s2.stream().flatMap(List::stream).forEach(n -> System.out.println(n));

		List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 75, 5, 33, 55, 65, 4, 3, 33, 4, 55, 6, 7, 7, 6);
		Map<String, List<Integer>> grouped = numbers.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD"));
		grouped.forEach((key, value) -> System.out.println(key + ": " + value));

		List<Integer> numbers1 = Arrays.asList(3, 4, 4, 64, 4, 56, 7, 5, 4, 4, 56, 7, 334, 5, 67, 77, 56);
		Map<String, List<Integer>> grouped1 = numbers1.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD"));
		grouped1.forEach((key, value) -> System.out.println(key + " :" + value));
		
		
		List<List<String>> AnimalList = Arrays.asList(Arrays.asList("DOG","CAT"),Arrays.asList("BUFFLOW","COW"),Arrays.asList("CHITA","BHALU"),Arrays.asList("LION","TIGER"));
		AnimalList.stream().flatMap(List::stream).forEach(n->System.out.println(n));
		
		List<List<Integer>>  phoneNumber = Arrays.asList(
				Arrays.asList(34,54),
				Arrays.asList(34,76),
				Arrays.asList(32,88),
				Arrays.asList(22,99),
				Arrays.asList(88,99)
				);
		 phoneNumber.stream().flatMap(List::stream).forEach(n->System.out.println(n));
				
		  List<List<String>> studentList = Arrays.asList(
				  Arrays.asList("PRASHANT" ,"KUMAR"),
				  Arrays.asList("KISHAN","KUMAR"),
				  Arrays.asList("ASHISH","THAKUR"),
				  Arrays.asList("ABHISHEKH","TIWARI"),
				  Arrays.asList("GOLU","KUMAR")
				  );
		  
		  studentList.stream().flatMap(List::stream).forEach(n->System.out.println(n));
		  
		  List<Integer> evenNumber1 = Arrays.asList(10, 20, 30, 40, 50);
		Map<String, List<Integer>> num1 = evenNumber1.stream().collect(Collectors.groupingBy(n->n%2==0 ? "Even" : "Odd"));
		  num1.forEach((key,Value)->System.out.println(key + ": " +Value));
	}

}
