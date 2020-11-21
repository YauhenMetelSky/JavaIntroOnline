package by.metelsky.classes.agregationcomposition.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 *  (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора 
 *  транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/
	public static void main(String[] args) {
		Voucher voucher1 =new Voucher(10,Food.WITHOUTFOOD,Transport.BUS,VoucherType.VACATION,500);
		Voucher voucher2 =new Voucher(25,Food.ULTRAALLINCLUSIVE,Transport.PLAIN,VoucherType.VACATION,3000);
		Voucher voucher3 =new Voucher(12,Food.ULTRAALLINCLUSIVE,Transport.TRAIN,VoucherType.VACATION,1500);
		Voucher voucher4 =new Voucher(3,Food.BREAKFAST,Transport.PLAIN,VoucherType.SHOPPING,300);
		Voucher voucher5 =new Voucher(5,Food.BREAKFAST,Transport.BUS,VoucherType.EXCURSION,500);
		Voucher voucher6 =new Voucher(7,Food.ULTRAALLINCLUSIVE,Transport.BUS,VoucherType.VACATION,700);
		Voucher voucher7 =new Voucher(8,Food.WITHOUTFOOD,Transport.BUS,VoucherType.TREATMENT,1000);
		Voucher voucher8 =new Voucher(10,Food.ALLINCLUSIVE,Transport.TRAIN,VoucherType.VACATION,400);
		Voucher voucher9 =new Voucher(12,Food.WITHOUTFOOD,Transport.BUS,VoucherType.VACATION,600);
		Voucher voucher10 =new Voucher(7,Food.BREAKFAST,Transport.TRAIN,VoucherType.EXCURSION,850);
		TouristAgency touristAgency = new TouristAgency();
		touristAgency.addVoucher(voucher1);
		touristAgency.addVoucher(voucher2);
		touristAgency.addVoucher(voucher3);
		touristAgency.addVoucher(voucher4);
		touristAgency.addVoucher(voucher5);
		touristAgency.addVoucher(voucher6);
		touristAgency.addVoucher(voucher7);
		touristAgency.addVoucher(voucher8);
		touristAgency.addVoucher(voucher9);
		touristAgency.addVoucher(voucher10);
		View view = new View();
		List<Voucher> customerOffer = new ArrayList<>();
		customerOffer = TouristAgencyLogic.selectByTranspor(touristAgency.getVouchers(), Transport.BUS);
		view.printVoucherList(customerOffer);
		customerOffer = TouristAgencyLogic.selectByFood(customerOffer, Food.WITHOUTFOOD);
		view.printVoucherList(customerOffer);		
		TouristAgencyLogic.sortVauchers(customerOffer, new VouchersByPriceComparator());		
		view.printVoucherList(customerOffer);
		
		

	}

}
