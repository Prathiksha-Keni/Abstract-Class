package com.xworkz.AbstractClass.InterviewPortal;

public class InterviewTester {

	public static void main(String[] args) {

		InfosysInterviewPortal infosys = new InfosysInterviewPortal();
		infosys.login("prathu", "p123");
		infosys.interviewSchedule();
		infosys.prepareQuestionSet();
		infosys.takeTest();
		infosys.viewResult();
		infosys.logout();
		System.out.println("------------------------");
		WiproInterviewPortal wipro = new WiproInterviewPortal();
		wipro.login("prathu", "p123");
		wipro.interviewSchedule();
		wipro.prepareQuestionSet();
		wipro.takeTest();
		wipro.viewResult();
		wipro.logout();
	}

}
