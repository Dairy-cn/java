package com.dairui.chars;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 8, 6, 4, 1 };
		mergeSortMethod(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void mergeSortMethod(int[] arr, int left, int right) {
		// TODO Auto-generated method stub

		if (left < right) {
			int minddle = (left + right) / 2;
			mergeSortMethod(arr, left, minddle);
			mergeSortMethod(arr, minddle + 1, right);
			merging(arr, left, minddle, right);

		}

	}

	private static int[] merging(int[] arr, int left, int minddle, int right) {
		// TODO Auto-generated method stub
		int arrTemp[] = new int[arr.length];
		int mid = minddle + 1;
		int third = left;
		int temp = left;
		while (left <= minddle && mid <= right) {
			if (arr[left] <= arr[mid]) {
				arrTemp[third++] = arr[left++];
			} else {
				arrTemp[third++] = arr[mid++];
			}
		}
		while (mid <= right) {
			arrTemp[third++] = arr[mid++];
		}
		while (left <= minddle) {
			arrTemp[third++] = arr[left++];

		}
		while (temp <= right) {
			arr[temp] = arrTemp[temp++];

		}
		return arr;

	}
}
