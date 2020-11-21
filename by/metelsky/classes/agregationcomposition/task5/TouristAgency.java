package by.metelsky.classes.agregationcomposition.task5;

import java.util.ArrayList;
import java.util.List;

public class TouristAgency {
	List<Voucher> vouchers = new ArrayList<>();
		
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	public boolean addVoucher(Voucher voucher) {
		return vouchers.add(voucher);
	}
	public boolean removeVoucher(Voucher voucher) {
		return vouchers.remove(voucher);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
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
		TouristAgency other = (TouristAgency) obj;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}
	

}
