package array_4;

/**問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 
 * 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
*/
public class Array5 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };

		int intMax = 0;

		int intMin = 0;

		for (int i = 0; i < array.length; i++) {

			if (intMax < array[i]) {
				intMax = array[i];
			} else if (intMin > array[i]) {
				intMin = array[i];
			}
		}
		System.out.println(intMax);
		System.out.println(intMin);

	}

}
