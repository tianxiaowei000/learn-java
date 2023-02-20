package chapter_7;

/**
 * ︓以下コードのコンパイルエラー理由を教えてください。
 * // Pet.java
	public class Pet {
 	public String name;

 	public void setName(String value) {
 	this.name = value;
 	}
	}
	// Kicker.java
	public class Kicker {
	 public static void main(String...args) {
 	Pet cat = new Pet();
 	cat.setAge(1234);
	 }
	}

 * @author user
 *
 */

public class Kicker {

	public static void main(String... args) {

		Pet cat = new Pet();

		cat.setName(1234);

	}
}