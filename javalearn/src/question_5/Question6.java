package question_5;

/**
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * @author user
 *
 */
public class Question6 {

	public static void main(String[] args) {

		int array[][] = { { 10, 20 }, { 30, 45 }, { 55, 60 } };

		int aboard = 1;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				aboard *= array[i][j];
			}
		}

		System.out.println(aboard);
	}

}
