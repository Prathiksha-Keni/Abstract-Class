package com.xworkz.AbstractClass.HotelBooking;

public class HotelTester {

	public static void main(String[] args) {
		
		TreeboHotel treebo = new TreeboHotel();
		treebo.checkIn();
		treebo.IdProof();
		treebo.foodDetails();
		treebo.travelDesk();
		treebo.AcDetails();
		treebo.checkOut();
	    System.out.println("----------------------");
	    ResidencyHotel res = new ResidencyHotel();
	    res.checkIn();
	    res.IdProof();
	    res.foodDetails();
	    res.travelDesk();
	    res.AcDetails();
	    res.checkOut();

	}

}
