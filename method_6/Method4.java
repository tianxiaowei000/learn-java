package method_6;

/**
 * 質問７︓以下静的なメソッドを定義してください。
 * 1. メソッド名︓trim
 * 2. 引数１︓charの配列
 * 3. 戻り値︓charの配列
 * 4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
 * @param args
 */
public class Method4 {

	public static void main(String[] args) {
		
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		
		System.out.println();
		
		trim(input);
		
	}
	/**
	 * 空⽩⽂字列を削除
	 * @param input
	 * @return
	 */
	public static char[] trim(char[] input) {
		return input ;
		
		
	} 

}
