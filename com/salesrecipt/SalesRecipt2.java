package com.salesrecipt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SalesRecipt2 {
	//Variable declaration
			static String myName;
			static double totalProduct;
			static double grossPayAmount;
			static double discountPay;
			static Scanner boss;
	public static void nameACustomer() {
		//in this module a user is able to enter customers name
		System.out.println("Whats your name:");
		System.out.println();
		System.out.println("My name is ");
		boss = new Scanner(System.in);
		myName= boss.nextLine();
	}
public static void getProduct() {
	//in this module a user is able to enter product's name
	
	String nameOfProduct;
	int numberOfProduct;
	double priceOftheProduct;
	boss = new Scanner(System.in);
	System.out.println("Product name:");
	nameOfProduct= boss.nextLine();
System.out.println("Product Quantity: (Must be a whole number) ");
numberOfProduct= boss.nextInt();
System.out.println("Product Price: (Must be a a real number) ");
priceOftheProduct= boss.nextDouble();
if (priceOftheProduct<0||numberOfProduct<0) {
	System.out.println("Invalid input captured!!!!");
}else {
	totalProduct = numberOfProduct*priceOftheProduct;
}
	
}


public static void grossPayAmount() {
	grossPayAmount= totalProduct;
	
}
	
	public static void discountPay() {
		 if (grossPayAmount>0 && grossPayAmount<100) {
			discountPay = grossPayAmount;
			System.out.println("NO DISCOUNT ");
		} else if (grossPayAmount>100 && grossPayAmount<=500) {	
			discountPay = (grossPayAmount - 10);
			System.out.println("$10 DISCOUNT ");
	} else if(grossPayAmount>500 && grossPayAmount<=1000) {
		discountPay = grossPayAmount-20;
		System.out.println("$20 DISCOUNT ");
	} else if(grossPayAmount>1000) {
		discountPay = grossPayAmount-100;
		System.out.println("$30 DISCOUNT ");
	}else if (grossPayAmount<0) {
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
		DateFormat dateFormat = new SimpleDateFormat("  Today is  "+"EEE, d MMM yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
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
System.out.println("Customer Name:: " + myName);
System.out.println("Product:            "+ "                        Price of Product");
System.out.println();
getProduct();
System.out.println("Price:" );
System.out.println("$" + totalProduct );
System.out.println("====================================================");
System.out.println("Gross Pay Amount: " + grossPayAmount);
System.out.println("Discount: $" + (grossPayAmount-discountPay));
System.out.println("After Discount: " + discountPay);

}


public static void exitProgram() {
	System.out.println("Go HOME~!");
	
}
	public static void main(String[] args) {
		for (int i=0; i<10;i++) {
			
			System.out.println("~~~~~~~~" + "Customer : " + (i+1) + "~~~~~~~~");
			
			
			nameACustomer();
			getProduct();
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
		 exitProgram();
		
		
		
		
	}

}
