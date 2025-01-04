package com.creatio.crm.language.basics;

public class Assignment2Arrays {

	public static void main(String[] args) {

		// Define 3D Array to store product
		String[][][] Product = new String[2][4][5];

		// Main Category 1 (Groceries)
		// Sub category
		// 1.Beverage
		Product[0][0][0] = "Cola";
		Product[0][0][1] = "Orange Juice";
		Product[0][0][2] = "Lemonade";
		Product[0][0][3] = "Green Tea";
		Product[0][0][4] = "Black Coffee";
     	
		//2.Snacks
		Product[0][1][0] = "Popcorn";
		Product[0][1][1] = "Trail Mix";
		Product[0][1][2] = "Beef Jerky";
		Product[0][1][3] = "Salted Nuts";
		Product[0][1][4] = "Rice Cakes";

		//3.Dairy Products
		Product[0][2][0] = "Cottage Cheese";
		Product[0][2][1] = "Heavy Cream";
		Product[0][2][2] = "Ice Cream";
		Product[0][2][3] = "Parmesan Cheese";
		Product[0][2][4] = "Eggnog";

		//4.Produce
		Product[0][3][0] = "Apples";
		Product[0][3][1] = "Bananas";
		Product[0][3][2] = "Carrots";
		Product[0][3][3] = "Potatoes";
		Product[0][3][4] = "Onions";

		// Main Category 2 (Electronics)
		// Subcategory
		//1.Beverages 
		Product[1][0][0] = "Cola";
		Product[1][0][1] = "Orange Juice";
		Product[1][0][2] = "Lemonade";
		Product[1][0][3] = "Green Tea";
		Product[1][0][4] = "Black Coffee";

		// 2.Snacks
		Product[1][1][0] = "Popcorn";
		Product[1][1][1] = "Trail Mix";
		Product[1][1][2] = "Beef Jerky";
		Product[1][1][3] = "Salted Nuts";
		Product[1][1][4] = "Rice Cakes";

		// 3.Dairy Products
		Product[1][2][0] = "Cottage Cheese";
		Product[1][2][1] = "Heavy Cream";
		Product[1][2][2] = "Ice Cream";
		Product[1][2][3] = "Parmesan Cheese";
		Product[1][2][4] = "Eggnog";

		// 4.Produce
		Product[1][3][0] = "Apples";
		Product[1][3][1] = "Bananas";
		Product[1][3][2] = "Carrots";
		Product[1][3][3] = "Potatoes";
		Product[1][3][4] = "Onions";

	
		System.out.println(Product[1][3][4]);

	}

}


/*
 * A supermarket offers products in two main categories: "Groceries" and
 * "Electronics." Each category is further divided into four subcategories, with
 * each subcategory containing five products.
 * 
 * Can you store complete data in single Array?
 * 
 */
