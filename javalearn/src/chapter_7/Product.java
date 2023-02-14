package chapter_7;

	/**
	 * 質問２︓アマゾンの各商品(Product)にて、クラスを定義してください。例︓価格、写
	    真、商品名など…
	 * @author user
	 *
	 */

public class Product {

	//属性

	private int price;

	private String portrait;

	private String name;

	public Product() {

	}

	/**
	 * param price
	 * param portrait
	 * param name
	 */
	public Product(int price, String portrait, String name) {
		this.price = price;

		this.portrait = portrait;

		this.name = name;
	}
	
	//メソッド

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

}