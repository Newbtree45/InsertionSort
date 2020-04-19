/*
 * Travis Newberry
 * Newberts@mail.uc.edu
 * Assignment 10
 * 4/19/2020
 * 34IT2045C
 * A Junit Test for a program implementing an Insertion sort
 * Citations: Professor Nicholson
 * Extra Notes: Added comments to detail the tests.
 */
package sort.insertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		// Test 0
		// Testing a failure
		fail("Not yet implemented");
	}

	@Test
	void test1() {
		// Test 1
		// Testing a sort with basic data of positives, negatives, and two 1's
		int[] testData = {1, 42, 2, -1, 101, -5, 356, -99, 212, -400, 1};
		InsertionSort.Sort(testData);
		System.out.println("Test #1: ");
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + " ");
		}
		System.out.println();
	}

	@Test
	void test2() {
		// Test 2
		// Testing a sort to ascending order from 'jumbled' data.
		int[] testData = { 42, 2, -1, 101, -5, 356, -99, 212, -400, 1};
		System.out.println("Test #2: ");
		int test2Length = 100000;
		testData = new int[test2Length];
		int j = 0;
		// Initialize the test data in descending order so it's 'jumbled'.
		for (int i = testData.length - 1; i >= 0; i--) {
			testData[j] = i;
			j++;
		}
		// Sort in ascending order
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test2Length - 1]);
		System.out.println("Total execution time of test #2 in seconds " + ((double) (endTime - startTime)) / 1000);
	}

	@Test
	void test3() {
		// Test 3
		// Testing a sort to ascending order with pre-sorted data.
		int[] testData = { 42, 2, -1, 101, -5, 356, -99, 212, -400, 1};
		int test2Length = 100000;
		System.out.println("Test #3: ");
		int test3Length = 100000;
		testData = new int[test3Length];
		// Initialize the test data in ascending order: it will be pre-sorted.
		for (int i = 0; i < testData.length; i++) {
			testData[i] = i;
		}
		// Sort in ascending order
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test2Length - 1]);
		System.out.println("Total execution time of test #3 in seconds " + ((double) (endTime - startTime)) / 1000);
	}

	@Test
	void test4() {
		// Personal Test
		// Testing the programs ability to sort with massive numbers, 0's, and more data.
		System.out.println("Test #4: ");
		int[] testData = {1, 42, 2, -1, 2147483647, 101, -5, 35698, -99, 212, -40000, 1, 0, 76, 89, -73, 0, -2147483648};
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + " ");
		}
		System.out.println();
		System.out.println("Total execution time of test #4 in seconds " + ((double) (endTime - startTime)) / 1000);
	}

}
