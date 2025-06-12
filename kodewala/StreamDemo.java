package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 6 };

		List<Integer> s1 = new ArrayList<>(Arrays.asList(arr));

		List<Integer> number = s1.stream().map(n -> n * 2).collect(Collectors.toList()); // This is for countingNumber

		System.out.println("Counting number =" + number);

		// -----------------------------------------------------------------------------------------------------------
		List<Integer> evennumber = s1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()); // This is finding
																										// // the even
																										// number
		System.out.println(evennumber);

		// ------------------------------------------------------------------------------------------------------------
		List<Integer> oddNumber = s1.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()); // This is for odd
																									// number
		System.out.println("Odd Number =" + oddNumber);

		// ----------------------------------------------------------------------------------------------------------
		List<Integer> reverseNumber = s1.stream().filter(n -> n < 5).collect(Collectors.toList()); // Less then five

		System.out.println("Less Then 5 =" + reverseNumber);

		// ----------------------------------------------------------------------------------------------------------
		List<Integer> greaterThen = s1.stream().filter(n -> n > 4).collect(Collectors.toList()); // Greater then 4

		System.out.println("Greater then 4 =" + greaterThen);

		// -----------------------------------------------------------------------------------------------------------
		String name[] = { "PRASHANT", "Nishant", "ISHANT", "KISHAN", "ASHISH", "RAUSHAN" };

		List<String> list = new ArrayList<String>(Arrays.asList(name));

		// ----------------------------------------------------------------------------------------------------------
		List<String> nameOfStudent = list.stream().filter(n -> n.length() > 4).collect(Collectors.toList()); // name
																												// which
		System.out.println(nameOfStudent);

		// ----------------------------------------------------------------------------------------------------------
		List<String> reverse = list.stream().filter(n -> n.length() < 4).collect(Collectors.toList());

		System.out.println("This is the less then 4 character = " + reverse);

		// ---------------------------------------------------------------------------------------------------------->
		List<String> toLowerCase = list.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());

		System.out.println("THIS IS in the lower case  =" + toLowerCase);

		// ----------------------------------------------------------------------------------------------------------->
		List<String> toUpperCase = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());

		System.out.println("THIS IS THE STRING IN THE UPPER CASE =" + toUpperCase);

		List<Integer> listOfNum = Arrays.asList(55, 77, 88, 99, 44, 12, 01, 31, 12);
		listOfNum.stream().filter(n -> n > 20).forEach(System.out::println);

		listOfNum.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		listOfNum.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

		listOfNum.stream().map(n -> n).forEach(System.out::println);

		// ------------------------------------------------------------------------------------------------------------>

		List<String> sharName = Arrays.asList("AMIT", "Rahul", "Priya", "Kishan ");

		// ------------------------------------------------------------------------------------------------------------>

		sharName.stream().map(String::toUpperCase).forEach(System.out::println);

		// --------------------------------------------------------------------------------------------------------------->
		listOfNum.stream().filter(Integer -> Integer > 50).forEach(System.out::println);

		// -------------------------------------------------------------------------------------------------------------->
		sharName.stream().filter(n -> n.length() > 5).forEach(System.out::println);

		// ------------------------------------------------------------------------------------------------------------------>
		listOfNum.stream().sorted().forEach(System.out::println); // this is sorting the arrayList

		// ------------------------------------------------------------------------------------------------------------------->
		listOfNum.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// ------------------------------------------------------------------------------------------------------------------->
		listOfNum.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// ------------------------------------------------------------------------------------------------------------------>
		List<String> m1 = sharName.stream().filter(n -> n.length() > 4).collect(Collectors.toList());
		System.out.println(m1);

		// ------------------------------------------------------------------------------------------------------------------>
		List<Integer> numOfList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> squareList = numOfList.stream().map(n -> n * n).collect(Collectors.toList());

		System.out.println(squareList);
		// ------------------------------------------------------------------------------------------------------------------->

		List<String> nameOfEmploye = Arrays.asList("PRASHANT", "NISHANT", "PRAKASH", "VICKY", "NiSHU", "VIKASH");

		nameOfEmploye.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// -------------------------------------------------------------------------------------------------------------------->

		nameOfEmploye.stream().filter(n -> n.length() > 4).collect(Collectors.toSet());

		// --------------------------------------------------------------------------------------------------------------------->

		numOfList.stream().distinct().forEach(System.out::println);

		// ---------------------------------------------------------------------------------------------------------------------->

		numOfList.stream().limit(3).forEach(System.out::println);

		// ---------------------------------------------------------------------------------------------------------------------->

		numOfList.stream().skip(2).forEach(System.out::println);

		// ---------------------------------------------------------------------------------------------------------------------->

		List<Integer> nums = Arrays.asList(10, 33, 4, 55, 23, 445, 64, 23, 43, 23, 4, 55);

		// ---------------------------------------------------------------------------------------------------------------------->

		nums.stream().distinct().forEach(System.out::println);

		// ---------------------------------------------------------------------------------------------------------------------->

		nums.stream().limit(3).forEach(System.out::println);

		// ---------------------------------------------------------------------------------------------------------------------->

		nums.stream().skip(2).forEach(System.out::println);

		// ---------------------------------------------------------------------------------------------------------------------->

		Optional<String> first = Stream.of("PRASHANT", "NISHANT", "ISHANT", "SHRUTI", "VISHAKHA")
				.filter(n -> n.startsWith("p")).findFirst();

		first.ifPresent(System.out::println);

		// ----------------------------------------------------------------------------------------------------------------------->

		boolean result = nums.stream().anyMatch(n -> n > 25);

		System.out.println(result);

		// ------------------------------------------------------------------------------------------------------------------------>

		boolean result1 = nums.stream()

				.allMatch(n -> n > 5);

		// ------------------------------------------------------------------------------------------------------------------------->

		boolean result2 = nums.stream().noneMatch(n -> n < 0);

		// ------------------------------------------------------------------------------------------------------------------------->

		Map<Character, List<String>> grouped = nameOfEmploye.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
		System.out.println(grouped);

		// -------------------------------------------------------------------------------------------------------------------------->

		Map<Character, List<String>> group = nameOfEmploye.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
		System.out.println(group);

		// ---------------------------------------------------------------------------------------------------------------------------->

		nums.stream().distinct().forEach(System.out::println);

		Optional<String> start = Stream.of("PRASHANT", "PRAKASH", "NISHANT", "ISHANT", "PK")
				.filter(n -> n.startsWith("P")).findFirst();
		System.out.println(start);

		nums.stream().skip(2).filter(n -> n % 2 == 0).forEach(System.out::println);

		Map<Character, List<String>> grp = nameOfEmploye.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
		System.out.println(grp);

		Integer[] arr2 = { 4, 5, 6, 7, 8, 6, 7 };
		List<Integer> p1 = new ArrayList<>(Arrays.asList(arr2));
		p1.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		;

		String list2 = "THIS IS KODEWALA AND WE ARE LOCATED BANGLORE WE ARE PROVIDING IT CONSULTING AND SOFTWARE TRAINING HERE";
		List<String> listIS = new ArrayList<String>(Arrays.asList(list2));

		System.err.println("THIS IS THE TOTAL COUNT OF WORD ="
				+ Arrays.asList(list2.split(" ")).stream().filter(n -> n.length() > 2).map(n -> n).count());

		long s5 = listIS.stream().filter(n -> n.length() > 2).map(n -> n.split(" ")).count();
		System.out.println(s5);

	}
}
