package com.xworkz.AbstractClass.HotelBooking;

public class ResidencyHotel extends RoomAvaliable {

	public ResidencyHotel() {
		System.out.println("Residency Hotel Details");
		this.checkInDate="24-12-2021";
		this.checkOutDate="26-12-2021";
	}
	@Override
	public void foodDetails() {
		System.out.println("No food avaliable for complimentary");
		
	}

	@Override
	public void travelDesk() {
		System.out.println("travel desk not avaliable");		
	}

	@Override
	public void AcDetails() {
		System.out.println("AC facility not avaliable");
		
	}

}
