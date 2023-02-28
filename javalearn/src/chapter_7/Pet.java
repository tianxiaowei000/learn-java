package chapter_7;

/**
 * 質問１︓ペットクラスを定義してください。ペットクラスは名称と年齢を保有して。以下
				２インスタンスを作成してください。変数１︓cat , 変数２︓dog。catの名称は ”cat”, 年齢
				=2, dogの名称は ”dog”, 年齢=5。
				1. クラスを定義する。クラス名は Pet。
				2. 該当クラスに、「名称」「年齢」属性が保有しています。
				3. Petクラスをインスタンス化する。以下２つオブジェクトを作成してください。
				4. オブジェクト１︓変数名 = cat。名称 = “cat“, 年齢 = 2。
				5. オブジェクト２︓変数名 = dog。名称 = “dog“, 年齢 = 5。
 * @author user
 *
 */

public class Pet {

	

	private String name; //名称

	private int age; //年齢

	public Pet() {

	}

	/**
	 * param name
	 * param age
	 * @return 
	 */
	public Pet(String name, int age) {

		this.name = name;

		this.age = age;

	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setName(int age) {
		this.age = age;
	}

}
