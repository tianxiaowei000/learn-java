package problem_5;

/**
 * 質問５︓質問３の配列に値「７」のインデックスを求む。
 * @author user
 *
 */
public class Problem5 {

	public static void main(String[] args) {
		
		int[] array2 = { 1, 2, 6, 7, 9, 6, 2, 1 };
		
		for (int i = 1; i < array2.length; i++) {
			if (7 == array2[i]) {
				System.out.println(i);
			}
		}
	}
}
