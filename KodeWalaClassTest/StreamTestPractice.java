package com.KodeWalaClassTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamTestPractice {

	public static void main(String[] args) {

		// List of name Start With "A"
		List<String> list = List.of("Prashant", "Nishant", "Ishant", "Amit", "Sudarshan");
		list.stream().filter(n -> n.startsWith("P")).forEach(System.out::println);

		// ----------------------------------------------------------------------------------

		// List of number which is Even
		List<Integer> num = List.of(3, 4, 5, 3, 4, 5, 34, 22, 34, 455, 35, 345, 24323, 4543, 43, 435, 431);
		num.stream().filter(n -> n % 2 == 0).map(evn -> evn).forEach(System.out::println);

		// ----------------------------------------------------------------------------------

		// List of elements Converting to UPPERCASE
		List<String> s1 = List.of("prashant", "nishant", "ishant", "prakash", "rahul");
		s1.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

		// ----------------------------------------------------------------------------------

		// List Of Integer Finding the square
		List<Integer> sqr = List.of(3, 4, 653, 54, 5, 2, 53, 145, 4234, 5, 23);
		sqr.stream().map(square -> square * square).forEach(System.out::println);

		// From List i have to get name starting with a in
		List<String> strtWith = List.of("prashant", "Ankit", "Aman", "Ajmal", "Asutosh", "Afjal", "Ajad",
				"prashantKumar");
		strtWith.stream().filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).forEach(System.out::println);

		// ------------------------------------------------------------------------------------------------------------------

		// Remove Duplicate elements from list BY USING DISTINCT()
		List<Integer> dplicat = List.of(34, 53, 45, 34, 56, 453, 234, 53, 34, 53, 45, 34);
		dplicat.stream().distinct().forEach(System.out::println);

		// -----------------------------------------------------------------------

		// Remove duplicate String Using Distinct
		List<String> strDuplicate = List.of("PRASHANT", "PRASHANT", "NISHANT", "PRAKASH", "AKASHA", "NISHANT", "ISHANT",
				"ISHANT");
		strDuplicate.stream().distinct().forEach(System.out::println);

		// -------------------------------------------------------------------------------------------------------------------------

		// Sorting the list Using .sorted() method
		List<Integer> integerSort = List.of(43, 234, 57654, 1, 23, 4, 53, 567, 88, 23, 54);
		integerSort.stream().distinct().sorted().forEach(System.out::println);

		// -------------------------------------------------------------------------

		// Sorting String AlphaNumercali
		List<String> sortAlphaNumrcle = List.of("A", "C", "D", "B", "Z", "N", "I");
		sortAlphaNumrcle.stream().sorted().forEach(System.out::println);

		// -------------------------------------------------------------------------

		// Sorting String In Reverse order Using Comparator and for revere i am using
		// .reverseOrder()
		List<String> revrseSort = List.of("Z", "A", "N", "B", "E", "O", "i", "e", "H", "O");
		revrseSort.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// --------------------------------------------------------------------------------------

		// sortlist employ by salary ----> IMPORTANT LINE = > .map(Map.Entry::getKey) to
		// find the name only not all detail
		Map<String, Integer> employeeBySalary = Map.ofEntries(

				Map.entry("Prashant", 400000), Map.entry("Nishant", 30000), Map.entry("Ishant", 599999),
				Map.entry("Abhisekh", 40050), Map.entry("Anisha", 40405));
		employeeBySalary.entrySet().stream().filter(n -> n.getValue() > 40000).map(Map.Entry::getKey)
				.forEach(System.out::println);
		// ---------------------------------------------------------------------------------------------------------------------

		// THIS IS THE NEW WAY TO RIGHT THE SAME CODE IN THIS WAY

		List<StreamTestPractice> employe = List.of(new StreamTestPractice(3040504, "PRASHANT"),
				new StreamTestPractice(400000, "Prashant"), new StreamTestPractice(30000, "Nishant"),
				new StreamTestPractice(599999, "Ishant"), new StreamTestPractice(40050, "Abhisekh"),
				new StreamTestPractice(40405, "Anisha"));

		employe.stream().filter(n -> n.salary > 4999).forEach(System.out::println);
		// SORTED SALARY REVERSE ORDER
		employe.stream().sorted(Comparator.comparing(StreamTestPractice::getSalary).reversed())
				.forEach(System.out::println);
		// THIS LINE PRINTING THE HIGEST SALARY
		employe.stream().filter(e -> e.getSalary() >= 40000 && e.getSalary() <= 50000)
				.sorted(Comparator.comparing(StreamTestPractice::getSalary).reversed()).forEach(System.out::println);
		
		// This is printing the list of starting of 3 elements using limit()
		List<Integer> nums = List.of(20,39,49,50,697,2,34,45,677,44);
		nums.stream().limit(3).forEach(System.out::println);
		
		//-------------------------------------------------------------------------
		
		//Skip starting 3 elements using skip() method
		List<Integer> nums1 = List.of(3,4,5,6,4,5,6,2,345,345,6,3,45,6,3456);
		nums1.stream().skip(3).forEach(System.out::println);
		
		int page = 2;
		int pageSize = 3;
		nums1.stream().skip((page-1)*pageSize).limit(pageSize).forEach(System.out::println);
		
		
		Stream<Integer> infinite = Stream.iterate(1, n -> n + 1);

		infinite.filter(n -> n % 2 == 0)
		        .limit(5)
		        .forEach(System.out::println);

		
	}

	// This is the Another Way to Write Code to find the greatest elements using
	// Encapsulation
	private int salary;
	private String name;

	public StreamTestPractice(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	int getSalary() {
		return salary;
	}

	String getName() {
		return name;
	}

	// toString() for REDABLEOUTPUT

	@Override
	public String toString() {
		return name + " - " + salary;
	}

}
