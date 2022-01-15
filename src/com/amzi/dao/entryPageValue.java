package com.amzi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.entryBean;

public class entryPageValue {

	public static void main(String[] args) {
		// System.out.println("HELLO..");
	}

	public static void print() {
//		System.out.println("value: " + entryBean.getPlaceFrom());
//		System.out.println(entryBean.getPlaceTo());
//		System.out.println(entryBean.getGuestName());
//		System.out.println(entryBean.getTravelName());
//		System.out.println(entryBean.getGuestAddress());
//		System.out.println(entryBean.getMobNumber());
//		System.out.println(entryBean.getVehicle());
//		System.out.println(entryBean.getVehicleNumber());
//		System.out.println(entryBean.getDriverName());
//		System.out.println(entryBean.getDriverExpense());
//		System.out.println(entryBean.getRateKM());
//		System.out.println(entryBean.getDieselExpense());
//		System.out.println(entryBean.getToll());
//		System.out.println(entryBean.getAdvance());
//		System.out.println(entryBean.getCommission());
//		System.out.println(entryBean.getCommissionPer());
//		System.out.println(entryBean.getPayment());
//		System.out.println(entryBean.getDays());
	}

	@SuppressWarnings("deprecation")
	public static int addValue() {
		Connection conn = null;
		Statement statement = null;

		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "parshwanathcarrental";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			statement = conn.createStatement();
			String query = "INSERT INTO ledgerentry" + " VALUES ( '0','" + entryBean.getPlaceFrom() + "','"
					+ entryBean.getPlaceTo() + "','" + entryBean.getGuestName() + "','" + entryBean.getTravelName()
					+ "','" + entryBean.getGuestAddress() + "'," + entryBean.getMobNumber() + ",'"
					+ entryBean.getVehicle() + "','" + entryBean.getVehicleNumber() + "','" + entryBean.getDriverName()
					+ "'," + entryBean.getDriverExpense() + "," + entryBean.getRateKM() + ","
					+ entryBean.getDieselExpense() + "," + entryBean.getToll() + "," + entryBean.getAdvance() + ",'"
					+ entryBean.getVehicleOwner() + "'," + entryBean.getRunKM() + "," + entryBean.getTotal() + ",'"
					+ entryBean.getDateFrom() + "','" + entryBean.getDateTo() + "'," + entryBean.getGrandTotal() + ","
					+ entryBean.getCommission() + "," + entryBean.getCommissionPer() + ",'" + entryBean.getPayment()
					+ "'," + entryBean.getDays() + "," + entryBean.getTax() + ",'" + entryBean.getCommCheck() + "'"
					+ ")";
			System.out.println("values: " + entryBean.getPlaceFrom());
			System.out.println(query);
			statement.executeUpdate(query);
			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return 1;
	}

	public static int updateValue() {
		Connection conn = null;
		Statement statement = null;

		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "parshwanathcarrental";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url + dbName, userName, password);
			statement = conn.createStatement();
			String query = "update ledgerentry set placeFrom='" + entryBean.getPlaceFrom() + "',placeTo='"
					+ entryBean.getPlaceTo().toUpperCase() + "',guestName='" + entryBean.getGuestName().toUpperCase()
					+ "',travelName='" + entryBean.getTravelName().toUpperCase() + "',guestAddress='"
					+ entryBean.getGuestAddress().toUpperCase() + "',mobNumber='" + entryBean.getMobNumber()
					+ "',vehicle='" + entryBean.getVehicle() + "',vehicleNumber='" + entryBean.getVehicleNumber()
					+ "',driverName='" + entryBean.getDriverName().toUpperCase() + "',driverExpense='"
					+ entryBean.getDriverExpense() + "',rateKM='" + entryBean.getRateKM() + "',dieselExpense='"
					+ entryBean.getDieselExpense() + "',toll='" + entryBean.getToll() + "',advance='"
					+ entryBean.getAdvance() + "',vehicleOwner='" + entryBean.getVehicleOwner().toUpperCase()
					+ "',rumkm='" + entryBean.getRunKM() + "',total='" + entryBean.getTotal() + "',datefrom='"
					+ entryBean.getDateFrom() + "',dateto='" + entryBean.getDateTo() + "',grandtotal='"
					+ entryBean.getGrandTotal() + "',commission='" + entryBean.getCommission() + "',commissionper='"
					+ entryBean.getCommissionPer() + "',payment='" + entryBean.getPayment().toUpperCase() + "',days="
					+ entryBean.getDays() + ",tax=" + entryBean.getTax() + ", commcheck='"+entryBean.getCommCheck().toUpperCase() + "' where sno="
					+ entryBean.getsNo();

			System.out.println("values: " + entryBean.getPlaceFrom());
			System.out.println(query);
			statement.executeUpdate(query);
			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return 1;
	}

}
