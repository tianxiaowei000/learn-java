package chapter_8;

/**
 * 質問２︓以下コードの出⼒を回答してください。
 * @author user
 *
 */

public class Kicker {
	public static void main(String... args) {

		Employee x = new Employee("1234");

		Employee y = new Employee("1234");

		System.out.println(x == y); // true ? false? 原因は ?  false  == はオブジェクトを⽐較

		System.out.println(x.equals(y)); // true ? false? 原因は ?  ture 値同じ

	}
}
