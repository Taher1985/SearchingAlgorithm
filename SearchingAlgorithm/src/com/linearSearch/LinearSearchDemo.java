package com.linearSearch;

/*
 Start from the leftmost element of array and one by one compare number 'x'(number to be searched in array) with each element of array,
 If x matches with an element, return the index.
 If x doesn’t match with any of elements, return -1.
*/

public class LinearSearchDemo {

	public int linearSearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearchDemo demo = new LinearSearchDemo();
		int[] a = { 7, 2, 4, 0, 1, 5, 8, 3, 9 };
		int number = 2;
		int index = demo.linearSearch(a, number);
		System.out.println("Index of " + number + " is " + index);
	}
}
