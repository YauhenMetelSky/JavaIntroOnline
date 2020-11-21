package by.metelsky.classes.agregationcomposition.task5;

import java.util.Comparator;

public class VouchersByNumberDayComparator implements Comparator<Voucher>{

	@Override
	public int compare(Voucher o1, Voucher o2) {
		
		return o1.getNumberDays()-o2.getNumberDays();
	}

}
