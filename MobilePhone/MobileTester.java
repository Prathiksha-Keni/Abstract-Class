package com.xworkz.AbstractClass.MobilePhone;

public class MobileTester {

	public static void main(String[] args) {
		
		OnePlus onePlus = new OnePlus();
		onePlus.switchOn();
		onePlus.ScreenLength();
		onePlus.battery();
		onePlus.ram();
		onePlus.makeCall();
		onePlus.playMusic();
		System.out.println("--------------------");
		Samsung samsung = new Samsung();
		samsung.switchOn();
		samsung.ScreenLength();
		samsung.battery();
		samsung.ram();
		samsung.makeCall();
		samsung.playMusic();

	}

}
