package org.drulabs.algo.sort;

public abstract class Sorter {

	protected int[] input = null;

	public Sorter(int[] input) {
		this.input = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			this.input[i] = input[i];
		}
	}

	// all subclasses must implement their own sort
	public abstract int[] sort();

	abstract int getIterationCount();

	abstract String getSortName();

	public void printOutput() {
		int[] output = sort();

		System.out.println("Output of " + getSortName() + ":");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + ", ");
		}

		System.out.println("Iterations: " + getIterationCount() + "\n");
	}

	protected void printInput() {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println();
	}

}
