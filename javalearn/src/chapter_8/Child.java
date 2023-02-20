package chapter_8;

/**
 * 質問３︓以下コンパイルを修正してください。
 * @author user
 *
 */

public class Child extends Parent {

	@Override // 親クラスの強制的にOverrideする意味（アノテーション）

	public void hello() {

		System.out.println("child method");

	}

}
