package org.drulabs.algo.problems;

public class MaxSubArray {

	int[] input;

	private int subMinIndex = 0, subMaxIndex = 0;
	private int maxSum = 0;

	public MaxSubArray(int[] input) {
		this.input = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			this.input[i] = input[i];
		}
	}

	public void printResults() {

		int maxSoFar = 0, currentMax = 0;

		for (int i = 0; i < input.length; i++) {

			currentMax = Math.max(input[i], currentMax + input[i]);

			// maxSoFar = Math.max(currentMax, maxSoFar);
			if (currentMax > maxSoFar) {
				maxSoFar = currentMax;
				subMaxIndex = i;
			}
			System.out.println(currentMax + "-" + maxSoFar);
		}
		System.out.println("Max sum: " + maxSoFar + " subarray index range:" + subMinIndex + "-" + subMaxIndex);
	}

	public int getMaxSum() {
		return maxSum;
	}

	public int getMinIndex() {
		return subMinIndex;
	}

	public int getMaxIndex() {
		return subMaxIndex;
	}
}
