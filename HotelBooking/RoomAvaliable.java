package com.xworkz.AbstractClass.HotelBooking;

abstract public class RoomAvaliable {

	
	String checkInDate;
	String checkOutDate;
	public RoomAvaliable() {
		System.out.println("Rooms avaliable");
	}
	
	public void checkIn() {
		System.out.println("Chceked In on "+checkInDate);
	}
	
	public void IdProof() {
		System.out.println("ID Proof Approved");
	}
	
	public void checkOut() {
		System.out.println("Checked Out on "+checkOutDate);
	}
	
	
	abstract public void foodDetails();
	abstract public void travelDesk();
	abstract public void AcDetails();
}
