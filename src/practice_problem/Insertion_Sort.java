package practice_problem;

public class Insertion_Sort {
	public static void main(String a[]) {
		String[] arr = { "Use", "Insertion Sort", "to sort", "the", "word", "in the", "String", "array" };
		System.out.println("BEFORE INSERTION SORT ::");
		for (String i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("=======================================================");

		System.out.println("AFTER INSERTION SORT ::");
		String sortedArray[] = sort_sub(arr, arr.length);
		for (String i : sortedArray) {
			System.out.print(i + " ");
		}
	}

	public static String[] sort_sub(String array[], int f) {
		String temp = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}