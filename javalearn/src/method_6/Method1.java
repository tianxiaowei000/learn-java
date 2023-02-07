package method_6;

/**
 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
び出してください。

 * @author user
 *
 */
public class Method1 {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 4, 5, 6 };
		System.out.println(sum1(array1));
		System.out.println(max1(array1));
		System.out.println(min1(array1));
	}
/**
 * 合計
 * @param array1
 * @return
 */
	public static int sum1(int[] array1) {
		
		int sum1 = 0;
		
		for (int i = 0; i < array1.length; i++) {
			
			sum1 += array1[i];

		}
		return sum1;
	}

	public static int max1(int[] array1) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int max1 = 0;
		for (int i = 1; i < array1.length; i++) {
			if (max1 < array1[i]) {
				max1 = array1[i];
			}

		}
		return max1;
	}

	public static int min1(int[] array1) {
		int min1 = 1;
		for (int i = 1; i < array1.length; i++) {
			if (min1 > array1[i]) {
				min1 += array1[i];
			}
		}
		return min1;
	}
}