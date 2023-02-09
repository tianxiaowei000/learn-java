package method_6;

import java.util.Arrays;

/**
 * 質問８︓バブルソート⽤メソッドを作成してください。
 *  1. メソッド名︓bubbleSort
	 2. 引数１︓intの配列
	 3. 戻り値︓ソート済みの配列
	 4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
 * @author user
 *
 */
public class Question8 {

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 7, 2, 4 };

		int temp = 0;
		

		System.out.println(Arrays.toString(bubbleSort(array)));

	}

	/**
	 * bubbleSort
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {

		int temp = 0;

		for (int i = 1; i < array.length; i++) {
				if (array[i-1] < array[i]) {
					temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
			}

		return array;

	}
}
