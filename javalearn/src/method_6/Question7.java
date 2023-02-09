package method_6;

import java.util.Arrays;

/**7︓以下静的なメソッドを定義してください。
 * 1. メソッド名︓trim
 * 2. 引数１︓charの配列
 * 3. 戻り値︓charの配列
 * 4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください
 * @author user
 *ヒント︓
 *1. 配列の起点から、 ' ' ではない⽂字列のインデックスを探す。
 *2. 配列の終点から、 ' ' ではない⽂字列のインデックスを探す。
 *3. 起点と終点を引数として、質問６-２で作成したサブ配列メソッドを呼び出して、結果を求める。
 */

public class Question7 {

	public static void main(String[] args) {
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		char[] output = trim(input);
		System.out.println(Arrays.toString(output));
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static char[] trim(char[] input) {
		int sIx = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') {
				sIx = i;
				break;
			}
		}
		int eIx = 0;
		for (int i = input.length - 1; i < input.length; i--) {
			if (input[i] != ' ') {
				eIx = i;
				break;
			}
		}

		return subArray(input,sIx,eIx);

	}

	/**
	 * サブ処理
	 * @param array
	 * @param startIndex
	 * @param length
	 * @return
	 */

	public static char[] subArray(char[] input, int sIx, int eIx) {

		char[] result = new char[eIx];

		for (int i = 0; i < eIx; i++) {
			result[i] = input[i + sIx];
		}

		return result;

	}
}
