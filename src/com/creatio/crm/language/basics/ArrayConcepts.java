package com.creatio.crm.language.basics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//(If you want to create empty array first and add the values later)
		String [] EmpName = new String [3];
		EmpName[0] = "Amit";
		EmpName[1] = "Neha";
		EmpName[2] = "Sneha";
		//EmpName[3] = "Priyanka"; if we add more than 3 then get an error as Index 3 out of bounds
		
		//(When we have all the values, directly we can store)
		String [] emps = new String []{"Bhatat","Neha","Sneha"} ;
		int [] numbers = new int [] {1, 2, 3, 4, 5};
		
		//2-dimensional Array Example: (Array of multiple arrays)
		String [] [] empgroups = new String[3] [2];
		empgroups [0][0] = "Amit";
		empgroups [1][0] =  "Sneha";
		
		String[][] data = {{"ABC","123"}, {"XYZ","234"},{"CDF","567"}};
		

	}

}
