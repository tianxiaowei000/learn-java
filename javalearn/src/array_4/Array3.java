package array_4;

/**
 * 問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
 */
public class Array3 {

	public static void main(String[] args) {
		
		int[][] array = new int[2][3];
		
		array[0][0] = 1;
		array[1][1] = 2;
		array[1][2] = 3;
		
		System.out.println(array[0][0]);
		System.out.println(array[1][1]);
		System.out.println(array[1][2]);
	}
}
