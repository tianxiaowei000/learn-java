package chapter_7;

/**
 * 質問２︓Mathクラスを作成してください。以下メソッドを定義します。
			1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
			2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
			3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
			4. mainメソッドで上記それぞれメソッドを呼び出してください。
 * @author user
 *
 */

public class Math {

	public int max;
	public int min;
	public int average;

	public static int max(int[] input) {

		int max = 0;

		for (int i = 0; i < input.length; i++) {

			if (max < input[i]) {
				max = input[i];
			}

		}

		return max;
	}

	public static int min(int[] input) {

		int min = input[0];

		for (int i = 1; i < input.length; i++) {

			if (min > input[i]) {
				min = input[i];

			}
		}
		return min;

	}

	public static int average(int[] input) {

		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}

		return sum / input.length;

	}
}
