package com.creatio.crm.language.basics;

public class Assignment3EmoGroup {
	
	public static void main(String[] args) {

		/* Creating the object to access the data(i.e employee names ,IDs) that store in
		 * Assignment3Employess class
		 */
		Assignment3Employess Obj = new Assignment3Employess();
		
		/*
		 * Creating the two arrays to store the employee names and IDs in this class
		 */
		String[] EmpoyeeName =new String[3];
		EmpoyeeName[0] = Obj.employee_name1;
		EmpoyeeName[1] = Obj.employee_name2;
		EmpoyeeName[2] = Obj.employee_name3;
	
		int[] EmpoyeeID = new int[3];
		EmpoyeeID[0] = Obj.employee_id1;
		EmpoyeeID[1] = Obj.employee_id2;
		EmpoyeeID[2] = Obj.employee_id3;
		
		
		// print each employeename along with their corresponding ID.
		System.out.println("Employee Name:" + EmpoyeeName[0] + "," + "Employee ID:" + EmpoyeeID[0]);
		System.out.println("Employee Name:" + EmpoyeeName[1] + "," + "Employee ID:" + EmpoyeeID[1]);
		System.out.println("Employee Name:" + EmpoyeeName[2] + "," + "Employee ID:" + EmpoyeeID[2]);
		
		
		
	}
	

}
