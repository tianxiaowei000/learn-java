package method_6;

import java.util.Arrays;

/**
 * 質問６-１︓以下静的なメソッドを定義してください。
 * 1. メソッド名: megerArray
 * 2. 引数１︓intの配列 left
 * 3. 引数２︓intの配列 right
 * 4. 戻り値︓intの配列
 * 5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
 * @author user
 *
 */
public class Method2 {

	public static void main(String[] args) {

		int[] left = new int[] { 1, 22, 3, 44 };

		int[] right = new int[] { 2, 33, 4, 55 };

		int[] result = megerArray(left, right);

		System.out.println(Arrays.toString(result));
	}

	/**
	 * マージ処理
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] megerArray(int[] left, int[] right) {

		int[] result = new int[left.length + right.length];

		for (int i = 0; i < left.length; i++) {
			result[i] = left[i];
		}
		for (int j = 0; j < right.length; j++) {
			result[left.length + j] = right[j];
		}
		return result;

	}
}
