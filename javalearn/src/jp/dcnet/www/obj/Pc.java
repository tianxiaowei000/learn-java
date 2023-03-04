package jp.dcnet.www.obj;

public class Pc {

	// 属性　filed
	private String name;

	private String color;

	private String brand;

	private int price;

	
	public Pc() {

	}

	/**
	 * 
	 * @param name
	 * @param color
	 * @param brand
	 * @param price
	 */
	public Pc(String name, String color, String brand, int price) {

		this.name = name;

		this.color = color;

		this.brand = brand;

		this.price = price;

	}

	// method
	public void shutdown() {

		System.out.println("it's sutdown!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
