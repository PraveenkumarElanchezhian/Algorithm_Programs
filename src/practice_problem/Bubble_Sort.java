package practice_problem;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = { 11, 2, 33, 4, 55, 6, 77, 8, 99, 10 };
		System.out.println("BEFORE BUBBLE SORT ::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("=========================");

		System.out.println("AFTER BUBBLE SORT ::");
		int sortedArray = bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static int bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return temp;

	}
}