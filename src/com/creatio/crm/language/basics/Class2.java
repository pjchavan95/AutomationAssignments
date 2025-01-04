package com.creatio.crm.language.basics;

public class Class2 {

	public static void main(String[] args) {
		
		  Class1 obj = new Class1();
		  System.out.println(obj.name);
		  System.out.println(obj.EmpId); 
		  System.out.println(obj.passport);
		  System.out.println(obj.address);
		  obj.printAddress();
		 
         Class1 Obj = new Class1();
         System.out.println(Obj.name +","+Obj.pp +","+Obj.EmpId);
        // System.out.println(Obj);
	}

}
