package com.greatlearning.main;

import com.greatlearning.services.DepartmentDetailsService;

public class Main {

	public static void main(String[] args) {
		execProcedure();
	}

	private static void execProcedure() {
		DepartmentDetailsService deptDetails = new DepartmentDetailsService();
		deptDetails.printDepartmentDetails();
	}
}
