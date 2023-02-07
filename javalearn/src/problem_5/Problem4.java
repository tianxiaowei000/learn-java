package problem_5;

/**
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author user
 *
 */
public class Problem4 {

	public static void main(String[] args) {
		
		int[] array2 = { 1, 2, 6, 7, 9, 6, 2, 1 };
		
		int duplicate = 0;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (j != i && array2[j] == array2[i]) {
					duplicate++;
				}
			}
		}
		System.out.println(duplicate);
	}

}
