package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment{
	
	public AdminDepartment(){
		System.out.println("Welcome to Admin Department.");
	}
	
	@Override
	public String departmentName() {
		return "Admin Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	@Override
	public String  getWorkDeadline() {
		return "Complete by EOD";
	}
}
