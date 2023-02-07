package problem_5;

/**
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * @author user
 *
 */
public class Problem6 {

	public static void main(String[] args) {
		
		int array1[][] = { { 10, 20 }, { 30, 45 }, { 55, 60 } };
		
		int aboard = 1;
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				aboard *= array1[i][j];
			}
		}
		System.out.println(aboard);
	}

}
