package by.metelsky.basicofoop.task4.bean;

import java.io.Serializable;

public class Treasure implements Serializable {
	private static final long serialVersionUID = 1L;
	private int price;
	private String name;
	private String material;

	public Treasure() {
	}

	public Treasure(int price, String name, String material) {
		super();
		this.price = price;
		this.name = name;
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Treasure [price=" + price + ", name=" + name + ", material=" + material + "]";
	}
	

	

}
