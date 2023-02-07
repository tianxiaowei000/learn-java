package problem_5;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、
 * 最⼩値、和、平均値を求める
 * @author user
 *
 */
public class Problem3 {

	public static void main(String[] args) {

		int[] array2 = { 1, 2, 6, 7, 9, 6, 2, 1 };

		int intMax = array2[0];

		int intMin = array2[0];

		int sum = 0;

		for (int i = 1; i < array2.length; i++) {
			sum += array2[i];
			if (intMax < array2[i]) {
				intMax = array2[i];
			} else {
				if (intMin > array2[i])
					;
			}
		}
		System.out.println(intMax);
		System.out.println(intMin);
		System.out.println(sum / array2.length);

	}
}
