package org.drulabs.algo.sort;

public class HeapSort extends Sorter {

	private int iterationCount;

	public HeapSort(int[] input) {
		super(input);
		iterationCount = 0;
	}

	@Override
	public int[] sort() {
		// heapify the input array
		int length = input.length;
		for (int i = (length / 2) - 1; i >= 0; i--) {
			heapify(length, i);
		}

		// extract the max i.e the root of the heap and put it at the end of the
		// array re-heapify the resulting elements
		for (int i = length - 1; i >= 0; i--) {
			// moving root to end
			int temp = input[0];
			input[0] = input[i];
			input[i] = temp;

			// re-heapify the resulatant array to get a new root (max value as
			// it is max-heap)
			heapify(i, 0);
		}

		return input;
	}

	@Override
	int getIterationCount() {
		return iterationCount;
	}

	@Override
	String getSortName() {
		return "Heap sort";
	}

	void heapify(int heapSize, int rootIndex) {
		iterationCount++;
		int largest = rootIndex; // Initialize largest as root
		int l = 2 * rootIndex + 1; // left = 2*i + 1
		int r = 2 * rootIndex + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < heapSize && input[l] > input[largest]) {
			largest = l;
		}

		// If right child is larger than largest so far
		if (r < heapSize && input[r] > input[largest]) {
			largest = r;
		}

		// If largest index is not root index
		if (largest != rootIndex) {
			int temp = input[rootIndex];
			input[rootIndex] = input[largest];
			input[largest] = temp;

			// Recursively heapify the affected sub-tree
			heapify(heapSize, largest);
		}
	}

}
