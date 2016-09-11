package org.drulabs.algo.sort;

public class MergeSort extends Sorter {

	private int iterationCount;
	private int[] tempMergArr;

	public MergeSort(int[] input) {
		super(input);
		iterationCount = 0;
		tempMergArr = new int[input.length];
	}

	@Override
	public int[] sort() {
		return performMergeSort(input, 0, input.length - 1);
	}

	private int[] performMergeSort(int[] input, int lowIndex, int highIndex) {

		iterationCount++;
		
		if (lowIndex < highIndex) {

			int mid = lowIndex + ((highIndex - lowIndex) / 2);

			// sort left sub sequence
			performMergeSort(input, lowIndex, mid);

			// sort right sub sequence
			performMergeSort(input, mid + 1, highIndex);

			// merget sorted sub sequences
			mergeParts(lowIndex, mid, highIndex);
		}

		return input;
	}

	private void mergeParts(int lowIndex, int mid, int highIndex) {
		for (int i = lowIndex; i <= highIndex; i++) {
			tempMergArr[i] = input[i];
		}
		int i = lowIndex;
		int j = mid + 1;
		int k = lowIndex;
		while (i <= mid && j <= highIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				input[k] = tempMergArr[i];
				i++;
			} else {
				input[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			input[k] = tempMergArr[i];
			k++;
			i++;
		}
	}

	@Override
	int getIterationCount() {
		return iterationCount;
	}

	@Override
	String getSortName() {
		return "Merge sort";
	}

}
