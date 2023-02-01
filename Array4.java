
public class Array4 {

	public static void main(String[] args) {
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}

	}

}
