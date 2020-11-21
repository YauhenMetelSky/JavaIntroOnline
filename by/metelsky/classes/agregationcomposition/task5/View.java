package by.metelsky.classes.agregationcomposition.task5;

import java.util.List;

public class View {
	public void printVoucher(Voucher voucher) {
		System.out.println(voucher);
	}
	public void printVoucherList(List<Voucher> vouchers) {
		for(Voucher voucher: vouchers) {
			System.out.println(voucher);
		}
	}

}
