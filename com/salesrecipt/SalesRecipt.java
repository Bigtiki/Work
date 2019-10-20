package com.salesrecipt;

import java.util.Scanner;

public class SalesRecipt {
	//Variable declaration
			static String nameOfCustomers;
			static String nameOfProduct;
			static int numberOfProduct;
			static double priceOftheProduct;
			static double grossPayAmount;
			static double discountPay;

	public static void nameOfCustomers() {
		//in this module a user is able to enter customers name
		System.out.println("Customer name:");
		Scanner  boss = new Scanner(System.in);
		nameOfCustomers= boss.nextLine();
	}
public static void nameOfProduct() {
	//in this module a user is able to enter product's name
	Scanner  boss1 = new Scanner(System.in);
	System.out.println("Product name:");
	nameOfProduct= boss1.nextLine();
		
	}
public static void numberOfProduct() {
	//in this module a user is able to enter quantity of the product
	Scanner  boss2 = new Scanner(System.in);
System.out.println("Product Quantity:");
numberOfProduct= boss2.nextInt();
	
}
public static void priceOftheProduct() {
	//in this module a user is able to enter Price of the product
	Scanner  boss2 = new Scanner(System.in);
	System.out.println("Product Price:");
	priceOftheProduct= boss2.nextDouble();
}
public static void grossPayAmount() {
	grossPayAmount= numberOfProduct*priceOftheProduct;
}
	
	public static void discountPay() {
		
		if (grossPayAmount>0 && grossPayAmount<=100) {
			discountPay = grossPayAmount;
			System.out.println("NO DISCOUNT ");
		} else if (grossPayAmount>100 && grossPayAmount<=500) {	
			discountPay = (grossPayAmount - 10);
			System.out.println("$10 DISCOUNT ");
	} else if(grossPayAmount>500 && grossPayAmount<=1000) {
		discountPay = grossPayAmount-20;
		System.out.println("$20 DISCOUNT ");
	} else if(grossPayAmount>1000 && grossPayAmount<=1500) {	
		discountPay = grossPayAmount-50;
		System.out.println("$50 DISCOUNT ");
	} else if(grossPayAmount>6000) {
		discountPay = grossPayAmount-100;
		System.out.println("$100 DISCOUNT ");
	}
		else {
		discountPay = 0;
		System.out.println("Invalid input captured!!!!");
	}
	} 
	public static void welcomeBack() {
		//In this module the customer is greeted.
		System.out.println("*****Thank You for Shopping*******");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("!>>>>>>>>>>>>>Welcome BACK<<<<<<<<<<<<<<");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("$$$$$$$$>>>>>>" + "PAY-N-SHOP" + "<<<<<<<$$$$$$$");
		
		System.out.println("");
		System.out.println("*_*! NO REFUND OR EXCHANGE!");
		System.out.println("CASH ONLY!");
		System.out.println("");
		System.out.println("               " + "25, Left St"+ "            ");
		System.out.println("      	 " + "HelloJava, Bangladesh 2019" + "        ");
		System.out.println("             " + "  (508)-$$$-$$$$  " + "        ");
		System.out.println("");
		System.out.println("_____________" + "$ALES RECEIPT"+ "______________");
		System.out.println("");
		System.out.println("Your Checker Today Is                  * Java");
				}
public static void displayOutput() {
	System.out.println("====================================================");
System.out.println("Customer Name:: " + nameOfCustomers);
System.out.println("Product:            "+ "                        Price of Product");
System.out.println( numberOfProduct +" "+nameOfProduct  + "                   " +priceOftheProduct );
System.out.println("Price:" );
System.out.println("$" + priceOftheProduct );
System.out.println("====================================================");
System.out.println("Gross Pay Amount: " + grossPayAmount);
System.out.println("Discount: $" + (grossPayAmount-discountPay));
System.out.println("After Discount: " + discountPay);

}


public static void exitProgram() {
	
}
	public static void main(String[] args) {
		for (int i=0; i<10;i++) {
			
			System.out.println("~~~~~~~~" + "Customer : " + (i+1) + "~~~~~~~~");
			nameOfCustomers();
			nameOfProduct();
			numberOfProduct();			
			priceOftheProduct();
			discountPay();
			grossPayAmount();
			discountPay();
			welcomeBack();
			displayOutput();
		
				
				//Option to continue 
			 String doYouWantToContinue;
				Scanner choiceScanner = new Scanner(System.in);
				
				System.out.println("DO You Want to continue ...");
				
				doYouWantToContinue = choiceScanner.nextLine();
				
				if (doYouWantToContinue.equals("no")) {
					break;
			}
			}
		
		
		
		
	}

}
