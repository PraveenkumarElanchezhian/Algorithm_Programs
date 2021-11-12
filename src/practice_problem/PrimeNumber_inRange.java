package practice_problem;

import org.junit.Test;

public class PrimeNumber_inRange {
	@Test
	public static void main(String[] args) {
		// loop for finding and printing all prime numbers between given range
		for (int i = 0; i <= 1000; i++) {
			// logic for checking number is prime or not
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);
		}
	}
}