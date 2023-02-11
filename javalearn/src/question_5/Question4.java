package question_5;

/**
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author user
 *
 */
public class Question4 {

	public static void main(String[] args) {
		
		int[] x = { 1, 2, 6, 7, 9, 6, 2, 1 };
		
		duplication(x);
	}

	/**
	 * 重複処理
	 * @param x
	 */
	public static void duplication(int[] x) {
		
		int count = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i + 1; j < x.length; j++) {
				
				if (x[i] == x[j]) {
					count++;
				}
			}			
			if (count == 1)
				System.out.println(x[i]);
			count = 0;
		}
	}
}
