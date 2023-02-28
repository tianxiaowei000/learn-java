package chapter_7;

/**
 * 1. 新規型 Matrix を定義します。
 * 2. ⾏列の加算を考えます。Matrix a, Matrix b, Matrix c = a + b;
 * 3. 但し算術演算⼦は基本型（数値型）のみ利⽤可能の為、addメソッドを定義する必要。
 * 4. addメソッド︓引数１︓タイプ⾏列、戻り値の型︓⾏列（Matrix）⇒ this をよく理解してください。

 * @author user
 *
 */

public class Matrix {
	private final int[][] data;

	/** construct method */
	public Matrix(int[][] data) {
		this.data = data;
	}

	// 行列 ADD
	public Matrix add(Matrix b) {
		
		Matrix c = new Matrix(data);
		
		c.data[0][0] = this.data[0][0] + b.data[0][0];
		
		c.data[0][1] = this.data[0][1] + b.data[0][1];
		
		c.data[1][0] = this.data[1][0] + b.data[1][0];
		
		c.data[1][1] = this.data[1][1] + b.data[1][1];
		
		return c;
	}

}
