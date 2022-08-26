package org.newprogram;

import java.util.ArrayList;
import java.util.Map;

public class ApiTask {
	
	public static void main(String[] args) {
		ApiTask detail1 = new ApiTask("Jasan","Cross" ,"jasancross@gmail.com", 805932123 , "Mar 96", "BE","East");
		ApiTask detail2 = new ApiTask("Anto","Alvin" ,"alvin@gmail.com", 805932124 , "Dec 974", "MBA","West");
		ApiTask detail3 = new ApiTask("Brandon","Eric" ,"brandon@gmail.com", 805932122 , "Jun 97", "MBA","North");
	
	}

	private String FirstName;
	private String LastName;
	private String email;
	private int MobileNo;
	private String DOB;
	private String Subject;
	private String CurrentAddress;
	
	
	public ApiTask(String firstName, String lastName, String email, int mobileNo, String dOB, String subject,
			String currentAddress) {
		
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		MobileNo = mobileNo;
		DOB = dOB;
		Subject = subject;
		CurrentAddress = currentAddress;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getCurrentAddress() {
		return CurrentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		CurrentAddress = currentAddress;
	}
	




}

	
	
	
	
	

