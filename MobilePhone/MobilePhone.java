package com.xworkz.AbstractClass.MobilePhone;

abstract public class MobilePhone {

	public void switchOn() {
		System.out.println("Switch On");
	}
	public void makeCall() {
		System.out.println("Make a call");
	}
	public void playMusic() {
		System.out.println("Playing music");
	}
	
	abstract public void ScreenLength();
	abstract public void battery();
	abstract public void ram();
}
