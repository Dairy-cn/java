package com.dairui.chars;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = new int[] { 1, 2, 5, 3, 2, 90, 32 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(i);
		for (int j : i) {
			System.out.println(j);
		}

	}

	public void sort(int[] arry) {
		int len = arry.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arry[i] < arry[j]) {
					int tmp = arry[i];
					arry[i] = arry[j];
					arry[j] = tmp;
				}
			}
		}
	}

}
