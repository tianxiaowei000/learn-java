package chapter_7;
/**
 * 質問２︓Mathクラスを作成してください。以下メソッドを定義します。
			1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
			2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
			3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
			4. mainメソッドで上記それぞれメソッドを呼び出してください。
 * @author user
 *
 */

public class MathTest {

	public static void main(String[] args) {

		int[] array = { 11, 2, 6, 7, 9, 6, 2, 1 };

		System.out.println(Math.max(array));
		
		System.out.println(Math.min(array));
		
		System.out.println(Math.average(array));
	}

}
