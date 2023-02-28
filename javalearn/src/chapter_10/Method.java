package chapter_10;

/**
 * 以下⽂字列に対して常⽤な操作をすべて覚える必要があります。
 * @author user
 *
 */

public class Method {
	public static void main(String[] args) {
	

		/**
		 * char charAt(int index)
		 * 指定されたindexの⽂字を取得する
		 */
		
		System.out.println("abc".charAt(0));
		
		/**
		 * int compareTo(String another) 
		 * 指定された⽂字列を⽐較する
		 */
		
		System.out.println("abc".compareTo("abc"));
		
		/**
		 * int compareToIgnoreCase(Stringanother)
		 * 指定された⽂字列を⽐較する（⼤⼩⽂字無視）
		 */
		
		System.out.println("abc".compareTo("abc"));
		
		/**
		 * String concat(String another)
		 * ⽂字列を結合する
		 */
		
		System.out.println("abc".concat("123"));
		
		String str = "hello, world";
		
		byte[] bytes = str.getBytes();
		
		
	}

		
	}
