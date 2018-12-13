package pack_20_lifecycle.pack_10_bean_lifecycle.pack10_ini_method;

public class CouponsTracking {
	private boolean breakFastCoupon;
	private boolean lunchCoupon;
	private boolean giftCoupon;
	private boolean nightFunctionCoupon;
	
	private int countBFCoupon;
	private int countLCoupon;
	private int countGCoupon;
	private int countNFCoupon;
	
	public void initForTraining(){
		System.out.println("Init method executed.");
		breakFastCoupon = true;
		lunchCoupon = true;
		giftCoupon = false;
		nightFunctionCoupon = false;
	}
	
	public void initForSeminar(){
		breakFastCoupon = true;
		lunchCoupon = true;
		giftCoupon = true;
		nightFunctionCoupon = false;
	}
	
	public void initForAnnualFunction(){
		breakFastCoupon = true;
		lunchCoupon = true;
		giftCoupon = true;
		nightFunctionCoupon = true;
	}
	
	public void issueCoupon(){
		if (breakFastCoupon)
			countBFCoupon++;
		if (lunchCoupon)
			countLCoupon++;
		if (giftCoupon)
			countGCoupon++;
		if (nightFunctionCoupon)
			countNFCoupon++;
	}
	
	public void showCount(){
		System.out.println("Total BF Coupons issued:"+countBFCoupon);
		System.out.println("Total Lunch Coupons issued:"+countLCoupon);
		System.out.println("Total Gift Coupons issued:"+countGCoupon);
		System.out.println("Total nightFunction Coupons issued:"+ countNFCoupon);
	}
}
