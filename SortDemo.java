package com.dairui.chars;

import javax.xml.transform.Templates;

public class SortDemo {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// selectionSort(arr);
		// insertionSort(arr);
		sheelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static int[] bubblingSort(int[] arr) {
		int len = arr.length;
		// 简单的冒泡排序
		// for (int i = 0; i < len; i++) {
		// for (int j = len - 1; j > i; j--) {
		// if (arr[j] < arr[j - 1]) {
		// int temp = arr[j];
		// arr[j] = arr[j - 1];
		// arr[j - 1] = temp;
		//
		// }
		// }
		//
		// }
		// 冒泡法的改进
		boolean flag = true;
		for (int i = 0; i < len && flag; i++) {
			// for (int j = i + 1; j <len; j++) {
			//
			// if (arr[j] > arr[i]) {
			// int temp = arr[i];
			// arr[i] = arr[j];
			// arr[j] = temp;
			// }
			for (int j = len - 1; j > i; j--) {
				flag = false;
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;

				}
			}

		}

		return arr;

	}

	public static int[] selectionSort(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			// 先选择i下标的为最小值
			int min = i;
			for (int j = i + 1; j < len; j++) {
				// 和下标为i+1的作比较,如果有小于这个最小值的，把下标赋值给min
				if (arr[min] > arr[j]) {
					min = j;
				}

			}
			// 判断是否有最小数，如果有，交换
			if (i != min) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

		return arr;

	}

	public static int[] insertionSort(int[] arr) {
		int len = arr.length;// 4,3,2,1
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;

	}

	public static int[] sheelSort(int[] arr) {
	
		int len = arr.length;
		int temp = 0;
		int k = 0;
		for (int i = len / 2; i >= 1; i /= 2) {
			for (int j = i; j < len; j++) {

				temp = arr[j];
				k = j - i;
				for (; k >= 0 && arr[k] > temp; k -= i) {
					arr[k + i] = arr[k];

				}
				arr[k + i] = temp;
			}

		}
		return arr;
	}
}
