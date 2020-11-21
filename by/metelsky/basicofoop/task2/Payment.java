package by.metelsky.basicofoop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private int id;
	private List<Product> productsList;

	public Payment() {
		productsList = new ArrayList<>();
	}

	public Payment(int id, List<Product> list) {
		this.id = id;
		this.productsList = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	public boolean addProduct(Product product) {
		return productsList.add(product);
	}

	public boolean removeProduct(Product product) {
		return productsList.remove(product);
	}

	public int getAllAmount() {
		int amount = 0;
		for (Product product : productsList) {
			amount = amount + product.getPrice();
		}
		return amount;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((productsList == null) ? 0 : productsList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (id != other.id)
			return false;
		if (productsList == null) {
			if (other.productsList != null)
				return false;
		} else if (!productsList.equals(other.productsList))
			return false;
		return true;
	}


	public static class Product {
		private int price;
		private String name;

		public Product() {

		}

		public Product(int price, String name) {
			this.price = price;
			this.name = name;
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [price=" + price + ", name=" + name + "]";
		}

	}
}
