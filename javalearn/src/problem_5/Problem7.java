package problem_5;

import java.util.Arrays;

/**
 * 配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
 * @author user
 *
 */
public class Problem7 {

	public static void main(String[] args) {

		int[] array1 = { 1, 30, 5, 7, 2, 4 };

		int temp = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] < array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array1));
	}

	//	public static int sortx(int[] array1) {
	//
	//		int temp = 0;
	//		for (int i = 0; i < array1.length; i++) {
	//			for (int j = 0; j < array1.length; j++) {
	//				if (array1[i] < array1[j]) {
	//
	//					temp = array1[i];
	//					array1[i] = array1[j];
	//
	//					array1[j] = temp;
	//				}
	//			}
	//		}
	//		return array1;
	//	}
}