package org.drulabs.algo.sort;

public class BubbleSort extends Sorter {

	private int iterationCount;

	public BubbleSort(int[] input) {
		super(input);
		iterationCount = 0;
	}

	@Override
	public int[] sort() {

		int len = input.length;
		iterationCount++;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len - i); j++) {
				if (input[j - 1] > input[j]) {
					int key = input[j - 1];
					input[j - 1] = input[j];
					input[j] = key;
				}
				iterationCount++;
			}
		}

		return input;
	}

	@Override
	int getIterationCount() {
		return iterationCount;
	}

	@Override
	String getSortName() {
		return "Bubble sort";
	}

}
