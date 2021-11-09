package practice_problem;

public class Algorithm_Programs {
	public static void main(String[] args) {
		String str = "XYZ";
		int n = str.length();
		Algorithm_Programs permutation = new Algorithm_Programs();
		permutation.permute(str, 0, n - 1);
	}

	private void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
