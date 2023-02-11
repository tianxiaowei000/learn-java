package question_5;

/**
 * 質問 2:5の階乗を求める(for)。
 * @author user
 *
 */

public class Question2 {

	public static void main(String[] args) {

		int i;

		int aboard = 1;

		for (i = 1; i <= 5; i++) {
			aboard *= i;
		}
		System.out.print(aboard);
	}

}
