package com.dairui.chars;

public class HeapSort1 {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35,
				25, 53, 51 };
		heapMethod(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static int[] heapMethod(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			heap(arr, len - i - 1);
			swap(arr, 0, len - i - 1);

		}
		return arr;

	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	private static void heap(int[] arr, int lastindex) {
		// TODO Auto-generated method stub
		for (int j = lastindex / 2; j >= 0; j--) {
			int k = j;
			while (2 * k + 1 <= lastindex) {
				int biggerIndex = 2 * k + 1;

				if (biggerIndex < lastindex) {
					if (arr[biggerIndex] < arr[biggerIndex + 1]) {
						biggerIndex++;

					}
				}
				if (arr[k] < arr[biggerIndex]) {
					swap(arr, k, biggerIndex);
					k = biggerIndex;
				} else {
					break;
				}

			}

		}

	}

}
