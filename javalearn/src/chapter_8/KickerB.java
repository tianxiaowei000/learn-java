package chapter_8;

/**
 * 質問３︓以下コンパイルを修正してください。
 * public class Kicker {
 * public static void print(Child v) {
 * v.hello();
 * }
 * public static void main(String...args) {
 * print(new Parent());
 * print(new Child());
 * }
 * }

 * @author user
 *
 */

public class KickerB {

	public static void print(Child v) {

		v.hello();

	}

	public static void print(Parent c) {

		c.hello();

	}

	public static void main(String... args) {

		print(new Parent());

		print(new Child());

	}

}
