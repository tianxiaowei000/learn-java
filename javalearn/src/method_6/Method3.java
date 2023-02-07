package method_6;

import java.util.Arrays;

/**
 * 質問６-２︓以下静的なメソッドを定義してください。
 * 1. メソッド名: subArray
 * 2. 引数１︓intの配列 array
 * 3. 引数２︓開始のstartIndex
 * 4. 引数３︓⻑さlength
 * 5. 戻り値︓intの配列
 * 6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
 * @author user
 *
 */
public class Method3 {

	public static void main(String[] args) {
		
		int[] array = new int[] { 1, 2, 3, 4 };
		
		int startIndex = 1;
		
		int length = 2;
		
		int[] result = subArray(array, startIndex, length);
		
		System.out.println(Arrays.toString(result));
		
		System.out.println(Arrays.toString(result));

	}
	
	/**
	 * サブ処理
	 * @param array
	 * @param startIndex
	 * @param length
	 * @return
	 */

	public static int[] subArray(int[] array,int  startIndex,int length) {
		
		int[] result = new int[length];
		
			for(int i= 0;i<length;i++) {
				result[i]=array[i+startIndex];
			}
		

		return result;

	}
}
