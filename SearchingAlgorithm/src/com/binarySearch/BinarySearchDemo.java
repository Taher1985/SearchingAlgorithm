package com.binarySearch;

/*
 A binary search or half-interval search algorithm finds the position of a specified value (the input "key") within a sorted array. 
 In each step, the algorithm compares the input key value with the key value of the middle element of the array. 
 If the keys match, then a matching element has been found so its index, or position, is returned. 
 Otherwise, if the sought key is less than the middle element's key, then the algorithm repeats its action on the sub-array to the left of the middle element or, 
 if the input key is greater, on the sub-array to the right. 
 If the remaining array to be searched is reduced to zero, then the key cannot be found in the array and a special "Not found" indication is returned.
 */
public class BinarySearchDemo {

	public int binarySearch(int[] array, int key) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == key) {
				return mid;
			}
			if (array[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchDemo demo = new BinarySearchDemo();
		int[] array = { 52, 54, 65, 77, 79, 81, 84, 98 };
		int key = 52;
		int index = demo.binarySearch(array, key);
		System.out.println("Index of " + key + " is " + index);
	}
}
