package method_6;

/**
 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
び出してください。

 * @author user
 *
 */
public class Question2 {

	public static void main(String[] args) {

		int[] array = { 1, 3, 4, 5, 6 };

		System.out.println(intSum(array));

		System.out.println(intMax(array));

		System.out.println(intMin(array));

	}

	/**
	 * 合計
	 * @param array1
	 * @return
	 */
	public static int intSum(int[] array) {

		int intSum = 0;

		for (int i = 0; i < array.length; i++) {

			intSum += array[i];

		}
		return intSum;
	}

	/**
	 * MAX値
	 * @param array
	 * @return
	 */
	public static int intMax(int[] array) {

		int intMax = 0;

		for (int i = 1; i < array.length; i++) {

			if (intMax < array[i]) {
				intMax = array[i];
			}

		}

		return intMax;

	}

	/**
	 * MIN値
	 * @param array
	 * @return
	 */
	public static int intMin(int[] array) {

		int intMin = 1;

		for (int i = 1; i < array.length; i++) {

			if (intMin > array[i]) {
				intMin = array[i];
			}
		}

		return intMin;

	}
}