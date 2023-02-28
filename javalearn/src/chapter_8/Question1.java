package chapter_8;

public class Question1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		String x = "a";

		String y = "a";

		System.out.println(x == y); // true ? false? 原因は ?  true

		System.out.println(x.equals(y)); // true ? false? 原因は ?   true         値同じ

		String empty = "";

		String nullString = null;

		System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
	}
}
