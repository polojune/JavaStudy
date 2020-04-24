package a;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] a = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
		quickSort(a, 0, a.length - 1);

		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int pp = partition(a, start, end); // index position of the correctly placed value in the array
			quickSort(a, start, pp - 1); // sorts the left half of the range
			quickSort(a, pp + 1, end); // sorts the right half of the range
		}
	}

	public static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		// in the first iteration , i starts from -1
		int i = start - 1;
		for (int j = start; j <= end - 1; j++) {
			if (a[j] <= pivot) {
				i++;
				// we are swapping below
				int ival = a[i];
				int jval = a[j];
				a[i] = jval;
				a[j] = ival;
			}

		}
		// put the pivot value in the correct slot next
		int ival = a[i + 1];
		a[end] = ival;
		a[i + 1] = pivot; // here,pivot value is placed in the correct slot of the array

		return i + 1;
	}
}
