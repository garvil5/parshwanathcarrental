package com.amzi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class displayEntry {
	public static void main(String[] args) {
		Connection connection = null;
		Statement insertStmt = null;
		Statement selectStmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parshwanathcarrental", "root",
					"root");

			selectStmt = connection.createStatement();
			ResultSet rs = selectStmt.executeQuery("SELECT * from ledgerentry");
			int i = 1;
			while (rs.next()) {
//				System.out.println(rs.getString("placeFrom"));
//				System.out.println(rs.getString("placeTo"));
//				System.out.println(rs.getString("guestName"));
//				System.out.println(rs.getString("travelName"));
//				System.out.println(rs.getString("guestAddress"));
//				System.out.println(rs.getString("mobNumber"));
//				System.out.println(rs.getString("vehicle"));
//				System.out.println(rs.getString("vehicleNumber"));
//				System.out.println(rs.getString("driverName"));
//				System.out.println(rs.getString("driverExpense"));
//				System.out.println(rs.getString("rateKM"));
//				System.out.println(rs.getString("dieselExpense"));
//				System.out.println(rs.getString("toll"));
//				System.out.println(rs.getString("advance"));
				
//				displayEntryBean.setPlaceFrom(rs.getString("placeFrom"));
//				displayEntryBean.setPlaceTo(rs.getString("placeTo"));
//				displayEntryBean.setGuestName(rs.getString("guestName"));
//				displayEntryBean.setTravelName(rs.getString("travelName"));
//				displayEntryBean.setGuestAddress(rs.getString("guestAddress"));
//				displayEntryBean.setMobNumber(rs.getString("mobNumber"));
//				displayEntryBean.setVehicle(rs.getString("vehicle"));
//				displayEntryBean.setVehicleNumber(rs.getString("vehicleNumber"));
//				displayEntryBean.setDriverName(rs.getString("driverName"));
//				displayEntryBean.setDriverExpense(rs.getString("driverExpense"));
//				displayEntryBean.setRateKM(rs.getString("rateKM"));
//				displayEntryBean.setDieselExpense(rs.getString("dieselExpense"));
//				displayEntryBean.setToll(rs.getString("toll"));
//				displayEntryBean.setAdvance(rs.getString("advance"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				selectStmt.close();
//	                insertStmt.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
