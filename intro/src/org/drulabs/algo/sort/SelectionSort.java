package org.drulabs.algo.sort;

public class SelectionSort extends Sorter {

	private int iterationCount;

	public SelectionSort(int[] input) {
		super(input);
		iterationCount = 0;
	}

	@Override
	public int[] sort() {

		for (int i = 0; i < input.length - 1; i++) {

			int minNumIndex = i;
			iterationCount++;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minNumIndex])
					minNumIndex = j;
				iterationCount++;
			}

			int smallerNumber = input[minNumIndex];
			input[minNumIndex] = input[i];
			input[i] = smallerNumber;
		}

		return input;
	}

	@Override
	int getIterationCount() {
		return iterationCount;
	}

	@Override
	String getSortName() {
		return "Selection sort";
	}

}
