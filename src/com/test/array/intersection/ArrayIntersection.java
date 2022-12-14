package com.test.array.intersection;

public class ArrayIntersection {

	public void findArrayIntersection(int arr1[], int arr2[]) {

		if (arr1.length == 0 && arr2.length == 0) {

			return;
		}

		System.out.println("Intersection of the two arrays :");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
	}
}
