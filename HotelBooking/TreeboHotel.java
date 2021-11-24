package com.xworkz.AbstractClass.HotelBooking;

public class TreeboHotel extends RoomAvaliable {

	
	public TreeboHotel() {
		System.out.println("Treebo Hotel Details");
		this.checkInDate="24-11-2021";
		this.checkOutDate="26-11-2021";
	}
	
	@Override
	public void foodDetails() {
		System.out.println("Breakfast is complimentary ");
		
	}

	@Override
	public void travelDesk() {
		System.out.println("travel desk avaliable");
		
	}

	@Override
	public void AcDetails() {
		System.out.println("AC facility avaliable");
		
	}

}
