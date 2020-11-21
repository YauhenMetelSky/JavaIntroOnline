package by.metelsky.classes.agregationcomposition.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TouristAgencyLogic {
	
	public static void sortVauchers(List<Voucher> vouchers, Comparator comparator) {
		Collections.sort(vouchers,comparator);
	}
	
	public static List<Voucher> selectByFood(List<Voucher> vouchers, Food food){
		List<Voucher> selectedVouchers = new ArrayList<>();
		
		for(Voucher voucher: vouchers) {
			if(voucher.getFood().equals(food)) {
				selectedVouchers.add(voucher);
			}
		}
		
		return selectedVouchers;
	
	}
	public static List<Voucher> selectByTranspor(List<Voucher> vouchers, Transport transport){
		List<Voucher> selectedVouchers = new ArrayList<>();
		
		for(Voucher voucher: vouchers) {
			if(voucher.getTransport().equals(transport)) {
				selectedVouchers.add(voucher);
			}
		}
		
		return selectedVouchers;
	
	}
	public static List<Voucher> selectByType(List<Voucher> vouchers, VoucherType voucherType){
		List<Voucher> selectedVouchers = new ArrayList<>();
		
		for(Voucher voucher: vouchers) {
			if(voucher.getVoucherType().equals(voucherType)) {
				selectedVouchers.add(voucher);
			}
		}
		
		return selectedVouchers;
	
	}

}
