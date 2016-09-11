package org.drulabs.algo.sort;

public class InsertionSort extends Sorter {

	private int iterationCount;

	public InsertionSort(int[] input) {
		super(input);
		iterationCount = 0;
	}

	@Override
	public int[] sort() {
		int n = input.length;
		for (int j = 1; j < n; j++) {
			int key = input[j];
			int i = j - 1;
			iterationCount++;
			while ((i > -1) && (input[i] > key)) {
				input[i + 1] = input[i];
				i--;
				iterationCount++;
			}
			input[i + 1] = key;
		}
		return input;
	}

	@Override
	int getIterationCount() {
		return iterationCount;
	}

	@Override
	String getSortName() {
		return "Insertion sort";
	}

}
