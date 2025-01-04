package com.creatio.crm.language.basics;

public class Class3 extends Class1 {

	public static void main(String[] args) {
		Class3 obj = new Class3();
	    System.out.println(obj.name);
	    System.out.println(obj.EmpId);
	    System.out.println(obj.passport);
	    System.out.println(obj.address);
	    obj.printAddress();
	
	}

}
