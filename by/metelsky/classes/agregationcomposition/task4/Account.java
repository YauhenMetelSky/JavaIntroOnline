package by.metelsky.classes.agregationcomposition.task4;

public class Account {
	private int id;
	private int balance;
	private boolean isActive = false;

	public Account() {
		this.id = 0;
		this.balance=0;
		
	}

	public Account(int id, int balance) {
		this.id = id;
		this.balance = balance;
		this.isActive=true;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		return true;
	}
	
	

}
