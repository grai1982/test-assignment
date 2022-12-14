package com.test.array.intersection;

import java.util.Scanner;

public class ArrayIntersectionTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int arrSize1 = s.nextInt();
		System.out.println("Enter the size of the second array: ");
		int arrSize2 = s.nextInt();
		int arr1[] = new int[arrSize1];
		int arr2[] = new int[arrSize2];
		System.out.println("Enter the elements of the array1 one by one ");

		for (int i = 0; i < arrSize1; i++) {
			arr1[i] = s.nextInt();
		}
		System.out.println("First Array is: " + arr1);
		System.out.println("Enter the elements of the array2 one by one ");

		for (int i = 0; i < arrSize2; i++) {
			arr2[i] = s.nextInt();
		}
		System.out.println("Second Array is: " + arr2);
		
		ArrayIntersection arns = new ArrayIntersection();
		arns.findArrayIntersection(arr1, arr2);
	}
	
	
}
