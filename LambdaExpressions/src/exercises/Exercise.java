package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

	public static void main(String[] args) {

		// list of Strings
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		// list of Integers
		List<Integer> nums = Arrays.asList(3, 4, 7, 8, 12);

		// print "Hello " in front of each name besides "James"
		names.stream().filter(str -> !str.contains("James")).forEach(name -> System.out.println("Hello " + name));

		// print the product
		int num = nums.stream().reduce((a, b) -> a * b).get();
		System.out.println(num);

		// Sort the list
		List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());

		// Find the minimum value.
		System.out.println(sortedNums.get(0));

		// Find the maximum value.
		System.out.println(sortedNums.get(sortedNums.size() - 1));

		// Remove the even numbers.
		List<Integer> oddNums = sortedNums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(oddNums);

		// Remove the odd numbers.
		List<Integer> evenNums = sortedNums.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(evenNums);

		// print the sum
		int sum = nums.stream().reduce((a, b) -> a + b).get();
		System.out.println(sum);

		int j = nums.stream().map(x -> x * x).filter(i -> i % 2 != 0).sorted().collect(Collectors.toList()).get(0);
		System.out.println(j);
	}
}

/*
 * Given the following List of names, using a stream, have it print "Hello " in
 * front of each name besides "James". ("Michael", "Dean", "James", "Chris") #
 * DONE
 * 
 * Given the following List of Integers, using a stream, have it reduce and
 * print the product (all numbers multiplied together). (3, 4, 7, 8, 12)
 * 
 * Starting with a list of numbers, use streams to do the following: Find the
 * max value. # DONE Find the min value. # DONE Remove the odd numbers. # DONE
 * Remove the even numbers. # DONE Find the sum of the list. # DONE Square every
 * number in the list then remove the even numbers and then find the min value.
 */