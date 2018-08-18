package com.dairui.chars;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = new int[] { 1, 2, 5, 3, 2, 90, 21, 11, 23 };
		// 可以优化，有资料说end—begin在7（有的说在50）内 用直接插入排序会比较快，在之外用快速排序
		if (i.length > 7) {
			quickSort(i);
		} else {
			selectionSort(i);
		}
		for (int j : i) {
			System.out.println(j);
		}

	}

	private static int[] selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for (int j = 0; j < len; j++) {
			for (int k = j + 1; k < len; k++) {
				if (arr[k] < arr[j]) {
					int temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}

	public static void quickSort(int[] arr) {
		if (arr.length > 0) {
			quickMethod(arr, 0, arr.length - 1);
		}

	}

	public static void quickMethod(int[] arr, int begin, int end) {
		int getMiddles;
		// 迭代方式
		while (begin < end) {
			getMiddles = getMiddle(arr, begin, end);
			quickMethod(arr, begin, getMiddles - 1);
			begin = getMiddles + 1;
		}
		// 递归方式 性能迭代>递归
		// if (begin < end) {
		// getMiddles = getMiddle(arr, begin, end);
		// quickMethod(arr, begin, getMiddles - 1);
		// quickMethod(arr, getMiddles + 1, end);
		// }

	}

	private static int getMiddle(int[] arr, int begin, int end) {
		// TODO Auto-generated method stub

		// 这里temp可以选择中间数做查考
		// 如在第一个、最后一个、中间一个中取中间值
		int len = arr.length - 1;
		int middle = len / 2;
		// 大小顺序end>begin>middle,把中间值放到arr[begin]
		if (arr[begin] > arr[end]) {
			int temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
		}
		if (arr[middle] > arr[end]) {
			int temp = arr[middle];
			arr[middle] = arr[end];
			arr[end] = temp;
		}
		if (arr[middle] > arr[end]) {
			int temp = arr[middle];
			arr[middle] = arr[end];
			arr[end] = temp;
		}

		int temp = arr[begin];

		while (begin < end) {
			while (end > begin && temp <= arr[end]) {
				end--;
			}
			arr[begin] = arr[end];
			while (end > begin && temp >= arr[begin]) {
				begin++;

			}
			arr[end] = arr[begin];
		}
		arr[begin] = temp;
		return begin;
	}

	public static void swap(int[] arr, int k, int j) {
		int temp = arr[k];
		arr[k] = arr[j];
		arr[j] = temp;
	}

}
