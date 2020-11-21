package by.metelsky.classes.agregationcomposition.task5;

import java.util.Comparator;

public class VouchersByPriceComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {
		
		return o1.getPrice()-o2.getPrice();
	}

	
	

}
