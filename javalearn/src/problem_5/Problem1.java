package problem_5;

/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 * @author user
 *
 */
public class Problem1 {

	public static void main(String[] args) {

		int i;

		int sum = 0;

		for (i = 1; i <= 100; i++) {
			if (0 == i % 2) {
				sum += i;
			}
		}

		System.out.print(sum);

	}
}