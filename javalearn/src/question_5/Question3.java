package question_5;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、
 * 最⼩値、和、平均値を求める
 * @author user
 *
 */
public class Question3 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 6, 7, 9, 6, 2, 1};

		int intMax = array[0];

		int intMin = array[0];

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];

			if (intMax < array[i]) {
				intMax = array[i];
			} else if (intMin > array[i]) {
				intMin = array[i];
			}
		
		}
		
		System.out.println(intMax);
		System.out.println(intMin);
		System.out.println(sum / array.length);

	}
	}

