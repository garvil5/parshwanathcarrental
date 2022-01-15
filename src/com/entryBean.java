package com;

public class entryBean {

	private static String placeFrom = "";
	private static String placeTo = "";
	private static String guestName = "";
	private static String travelName = "";
	private static String guestAddress = "";
	private static Long mobNumber;
	private static String vehicle = "";
	private static String vehicleNumber = "";
	private static String driverName = "";
	private static int driverExpense = 0;
	private static int rateKM = 0;
	private static int toll = 0;
	private static int dieselExpense = 0;
	private static int advance = 0;
	private static String vehicleOwner = "";
	private static int runKM = 0;
	private static int total = 0;
	private static int grandTotal = 0;
	private static String dateFrom = "";
	private static String dateTo = "";
	private static String query = "";
	private static int sNo = 0;
	private static int commission = 0;
	private static int commissionPer = 0;
	private static String payment = "";
	private static int days= 0;
	private static String commCheck = "";
	private static int tax = 0;
	
	public static String getCommCheck() {
		return commCheck;
	}

	public static void setCommCheck(String commCheck) {
		entryBean.commCheck = commCheck;
	}

	public static int getTax() {
		return tax;
	}

	public static void setTax(int tax) {
		entryBean.tax = tax;
	}

	public static int getDays() {
		return days;
	}

	public static void setDays(int days) {
		entryBean.days = days;
	}

	public static final int getCommission() {
		return commission;
	}

	public static final void setCommission(int commission) {
		entryBean.commission = commission;
	}

	public static final int getCommissionPer() {
		return commissionPer;
	}

	public static final void setCommissionPer(int commissionPer) {
		entryBean.commissionPer = commissionPer;
	}

	public static final String getPayment() {
		return payment;
	}

	public static final void setPayment(String payment) {
		entryBean.payment = payment;
	}

	public static final int getsNo() {
		return sNo;
	}

	public static final void setsNo(int sNo) {
		entryBean.sNo = sNo;
	}

	public static final int getGrandTotal() {
		return grandTotal;
	}

	public static final void setGrandTotal(int grandTotal) {
		entryBean.grandTotal = grandTotal;
	}

	public static final String getQuery() {
		return query;
	}

	public static final void setQuery(String query) {
		entryBean.query = query;
	}

	public static final String getDateFrom() {
		return dateFrom;
	}

	public static final void setDateFrom(String dateFrom) {
		entryBean.dateFrom = dateFrom;
	}

	public static final String getDateTo() {
		return dateTo;
	}

	public static final void setDateTo(String dateTo) {
		entryBean.dateTo = dateTo;
	}

	public static final int getTotal() {
		return total;
	}

	public static final void setTotal(int total) {
		entryBean.total = total;
	}

	public static final int getRunKM() {
		return runKM;
	}

	public static final void setRunKM(int runKM) {
		entryBean.runKM = runKM;
	}

	public static String getPlaceFrom() {
		return placeFrom;
	}

	public static void setPlaceFrom(String placeFrom) {
		entryBean.placeFrom = placeFrom;
	}

	public static final String getPlaceTo() {
		return placeTo;
	}

	public static final void setPlaceTo(String placeTo) {
		entryBean.placeTo = placeTo;
	}

	public static final String getGuestName() {
		return guestName;
	}

	public static final void setGuestName(String guestName) {
		entryBean.guestName = guestName;
	}

	public static final String getTravelName() {
		return travelName;
	}

	public static final void setTravelName(String travelName) {
		entryBean.travelName = travelName;
	}

	public static final String getGuestAddress() {
		return guestAddress;
	}

	public static final void setGuestAddress(String guestAddress) {
		entryBean.guestAddress = guestAddress;
	}

	public static final Long getMobNumber() {
		return mobNumber;
	}

	public static final void setMobNumber(Long mobNumber) {
		entryBean.mobNumber = mobNumber;
	}

	public static final String getVehicle() {
		return vehicle;
	}

	public static final void setVehicle(String vehicle) {
		entryBean.vehicle = vehicle;
	}

	public static final String getVehicleNumber() {
		return vehicleNumber;
	}

	public static final void setVehicleNumber(String vehicleNumber) {
		entryBean.vehicleNumber = vehicleNumber;
	}

	public static final String getDriverName() {
		return driverName;
	}

	public static final void setDriverName(String driverName) {
		entryBean.driverName = driverName;
	}

	public static final int getDriverExpense() {
		return driverExpense;
	}

	public static final void setDriverExpense(int driverExpense) {
		entryBean.driverExpense = driverExpense;
	}

	public static final int getRateKM() {
		return rateKM;
	}

	public static final void setRateKM(int rateKM) {
		entryBean.rateKM = rateKM;
	}

	public static final int getToll() {
		return toll;
	}

	public static final void setToll(int toll) {
		entryBean.toll = toll;
	}

	public static final int getDieselExpense() {
		return dieselExpense;
	}

	public static final void setDieselExpense(int dieselExpense) {
		entryBean.dieselExpense = dieselExpense;
	}

	public static final int getAdvance() {
		return advance;
	}

	public static final void setAdvance(int advance) {
		entryBean.advance = advance;
	}

	public static final String getVehicleOwner() {
		return vehicleOwner;
	}

	public static final void setVehicleOwner(String vehicleOwner) {
		entryBean.vehicleOwner = vehicleOwner;
	}

	public String placeFromValue() {
		return entryBean.getPlaceFrom();
	}

	public String placeToValue() {
		return entryBean.getPlaceTo();
	}

	public String guestNameValue() {
		return entryBean.getGuestName();
	}

	public String guestAddressValue() {
		return entryBean.getGuestAddress();
	}

	public String travelNameValue() {
		return entryBean.getTravelName();
	}

	public Long mobNumberValue() {
		return entryBean.getMobNumber();
	}

	public String vehicleValue() {
		return entryBean.getVehicle();
	}

	public String vehicleNumberValue() {
		return entryBean.getVehicleNumber();
	}

	public String driverNameValue() {
		return entryBean.getDriverName();
	}

	public int driverExpenseValue() {
		return entryBean.getDriverExpense();
	}

	public int rateKMValue() {
		return entryBean.getRateKM();
	}

	public int dieselExpenseValue() {
		return entryBean.getDieselExpense();
	}

	public int tollValue() {
		return entryBean.getToll();
	}

	public int advanceValue() {
		return entryBean.getAdvance();
	}

	public int totalValue() {
		return entryBean.getTotal();
	}

	public int grandTotalValue() {
		return entryBean.getGrandTotal();
	}

	public int runKMValue() {
		return entryBean.getRunKM();
	}

	public String vehicleOwnerValue() {
		return entryBean.getVehicleOwner();
	}

	public String dateFromValue() {
		return entryBean.getDateFrom();
	}

	public String dateToValue() {
		return entryBean.getDateTo();
	}

	public String payment() {
		return entryBean.getPayment();

	}

	public int commission() {
		return entryBean.getCommission();
	}

	public int commissionPer() {
		return entryBean.getCommissionPer();
	}
	
	public int days() {
		return entryBean.getDays();
	}
	
	public int tax() {
		return entryBean.getTax();
	}
	
	public String commCheck() {
		return entryBean.getCommCheck();
	}
}