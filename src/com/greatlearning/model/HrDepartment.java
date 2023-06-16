package com.greatlearning.model;

public class HrDepartment  extends SuperDepartment{
	
	public HrDepartment(){
		System.out.println("Welcome to HR Department.");
	}
	
	@Override
	public String departmentName() {
		return "HR Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	@Override
	public String  getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team Lunch";
	}
}
