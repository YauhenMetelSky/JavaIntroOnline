package by.metelsky.classes.agregationcomposition.task5;

public class Voucher {
	private int numberDays;
	private Food food;
	private Transport transport;
	private VoucherType voucherType;
	private int price;
	
	
	public Voucher() {
		
	}
	
	public Voucher(int numberDays, Food food, Transport transport, VoucherType voucherType, int price) {
		super();
		this.numberDays = numberDays;
		this.food = food;
		this.transport = transport;
		this.voucherType = voucherType;
		this.price = price;
	}

	public int getNumberDays() {
		return numberDays;
	}
	public void setNumberDays(int numberDays) {
		this.numberDays = numberDays;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	public VoucherType getVoucherType() {
		return voucherType;
	}
	public void setVoucherType(VoucherType voucherType) {
		this.voucherType = voucherType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Voucher [numberDays=" + numberDays + ", food=" + food + ", transport=" + transport + ", voucherType="
				+ voucherType + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + numberDays;
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((voucherType == null) ? 0 : voucherType.hashCode());
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
		Voucher other = (Voucher) obj;
		if (food != other.food)
			return false;
		if (numberDays != other.numberDays)
			return false;
		if (price != other.price)
			return false;
		if (transport != other.transport)
			return false;
		if (voucherType != other.voucherType)
			return false;
		return true;
	}
	
	

}
