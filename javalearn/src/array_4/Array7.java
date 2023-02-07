package array_4;

/**
 * 問題７︓⾏列（２次元配列）の和と積を計算してください。
 * @author user
 *
 */
public class Array7 {

	public static void main(String[] args) {

		int array1[][] = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		int sum = 0;

		int aboard = 1;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				sum += array1[i][j];
				aboard *= array1[i][j];
			}
		}

		System.out.println(sum);

		System.out.println(aboard);
	}
}
