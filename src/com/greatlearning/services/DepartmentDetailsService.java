package com.greatlearning.services;

import com.greatlearning.interfaces.IDepartmentDetails;
import com.greatlearning.model.*;

public class DepartmentDetailsService implements IDepartmentDetails{

	public void printDepartmentDetails() {
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println(" ");
		
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println(" ");
		
		TechDepartment techDepartment = new TechDepartment();
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
	}
	
}
