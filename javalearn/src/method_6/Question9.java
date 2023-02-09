package method_6;

import java.util.Arrays;

/**
 * 質問９︓メソッドの呼び出す練習。
 * 質問６-１を⽤い、２つ配列をマージします。
 * 質問８を⽤い、ステップ１のマージした配列をソートする。
 * @author user
 *
 */
public class Question9 {

	public static void main(String[] args) {

		int[] left = new int[] { 1, 22, 3, 44 };

		int[] right = new int[] { 2, 33, 4, 55 };

		int[] result = megerArray(left, right);

		int temp = 0;

		System.out.println(Arrays.toString(bubbleSort(result)));
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

	/**
	 * bubbleSort
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] reult) {

		int temp = 0;

		for (int i = 1; i < reult.length; i++) {
			if (reult[i - 1] < reult[i]) {
				temp = reult[i - 1];
				reult[i - 1] = reult[i];
				reult[i] = temp;
			}
		}

		return reult;

	}
}
