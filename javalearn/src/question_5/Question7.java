package question_5;

import java.util.Arrays;

/**
 * 配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
 * @author user
 *
 */
public class Question7 {

	public static void main(String[] args) {

		int[] array = { 1, 30, 5, 7, 2, 4 };

		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}