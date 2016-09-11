package org.drulabs.algo.sort;

public class SorterEntry {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// random
		int[] input1 = { 7, 5, 2, 4, 1, 3, 6 };

		// textbook
		int[] input2 = { 5, 2, 4, 6, 1, 3 };

		// reverse sorted
		int[] input3 = { 7, 6, 5, 4, 3, 2, 1 };

		// almost sorted
		int[] input4 = { 1, 3, 4, 2, 5, 6, 8, 7, 9 };

		int[] input = input3;

		Sorter insertionSort = new InsertionSort(input);
		insertionSort.printOutput();

		Sorter mergeSort = new MergeSort(input);
		mergeSort.printOutput();

		Sorter bubbleSort = new BubbleSort(input);
		bubbleSort.printOutput();

		Sorter selectionSort = new SelectionSort(input);
		selectionSort.printOutput();

		Sorter heapSort = new HeapSort(input);
		heapSort.printOutput();
	}

}
