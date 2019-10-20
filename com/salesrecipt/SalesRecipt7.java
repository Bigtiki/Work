package com.salesrecipt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SalesRecipt7{
	//Variable declaration
			static String myName;
			static double totalProduct;
			static double grossPayAmount;
			static double discountPay;
			static Scanner boss;
			static String nameOfProduct;
			 static int numberOfProduct;
			static double priceOftheProduct;
			static double grossPay2;
	public static void nameACustomer() {
		//in this module a user is able to enter customers name
		System.out.print("Whats your name: ");
		System.out.println("(Enter your name)");
		System.out.print("My name is ");

		boss = new Scanner(System.in);
		myName= boss.nextLine();
	}
public static void getProduct() {
	//in this module a user is able to enter product's name
for (int ig=0; ig<10;ig++) {
		
		System.out.println( "Product: " + (ig+1));
	boss = new Scanner(System.in);
	System.out.println("Whatdid you buy today??");
	System.out.println("Ok....");
	System.out.print("Product name: ");
	nameOfProduct= boss.nextLine();
	System.out.println("Amount??");
System.out.println("Product Quantity: (Must be a whole number) ");
System.out.print("I got ");
numberOfProduct= boss.nextInt();
System.out.println(" OF " + nameOfProduct);
System.out.println("Product Price: (Must be a a real number) ");
System.out.print("$ ");
priceOftheProduct= boss.nextDouble();
if (priceOftheProduct<0||numberOfProduct<0) {
	System.out.println("Invalid input captured!!!!");
	System.out.println("CALL MANAGER!!!");
	System.out.println("CALL MANAGER!!!");
	System.out.println("CALL MANAGER!!!");
	System.out.println("CALL MANAGER!!!");
	System.out.println("CALL MANAGER!!!");
	System.out.println("CALL MANAGER!!!");
	exitProgram();
}else if (priceOftheProduct>0||numberOfProduct>0) {
	totalProduct = numberOfProduct*priceOftheProduct;
	System.out.println("Your TOTAL~!:$ "+ totalProduct);
}
if (ig>=0) {
	System.out.println("DO You Want to continue Shopping??...(type 'YES' or 'no' to exit)");
	boss = new Scanner(System.in);
	String noT = boss.nextLine();
	if(noT.equals("YES")) {
		System.out.println("Scann Your next Product!)");
	continue;}
	else if(noT.equals("no")) {
 exitProgram();
break;
	}
}
	
}
}


public static void grossPayAmount() {
	grossPayAmount= totalProduct;
	System.out.println(grossPayAmount);
}
public static void grossPayAmount2() {
	grossPay2 = (grossPayAmount+totalProduct);
	System.out.println(grossPay2);
}
	
	public static void discountPay() {
		 if (grossPayAmount>0 && grossPayAmount<100) {
			discountPay = grossPayAmount;
			System.out.println("NO DISCOUNT Under $100 ");
		} else if (grossPayAmount>100 && grossPayAmount<=500) {	
			discountPay = (grossPayAmount - 10);
			System.out.println("$10 DISCOUNT ");
	} else if(grossPayAmount>500 && grossPayAmount<=1000) {
		discountPay = grossPayAmount-20;
		System.out.println("$20 DISCOUNT ");
	} else if(grossPayAmount>1000) {
		discountPay = grossPayAmount-30;
		System.out.println("$30 DISCOUNT ");
	}else if (grossPayAmount<0) {
		System.out.println("Invalid input captured!!!!");
	}
	} 
	public static void welcomeBack() {
		//In this module the customer is greeted.
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("!>>>>>>>>>>>>>Welcome "+ myName+ "<<<<<<<<<<<<<<");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("*****Thank You for Shopping*******");
		System.out.println("$$$$$$$$>>>>>>" + "JAVA-CODES" + "<<<<<<<$$$$$$$");
		
		System.out.println("");
		System.out.print("Today is ");
		DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		System.out.println("RULES:");
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
System.out.println("Product Purchased: "+"                 "+ " Price of Product");
System.out.println();
System.out.println(nameOfProduct + "     "+numberOfProduct+"q X $"+priceOftheProduct );
System.out.println( "                                    "+ totalProduct);
System.out.println("Product Total Price:" );
System.out.println("$" + totalProduct );
System.out.println("====================================================");
System.out.println("Gross Pay Amount: " + grossPayAmount);
System.out.println("Discount: $" + ((grossPayAmount)-discountPay));
System.out.println("After Discount: " + discountPay);

}
public static void displayOutput2() {
	System.out.println("====================================================");
System.out.println("Customer Name:: " + myName);
System.out.println("Product Purchased: "+"                 "+ " Price of Product");
System.out.println();
System.out.println(nameOfProduct + "     "+numberOfProduct+"q X $"+priceOftheProduct );
System.out.println( "                                    "+ totalProduct);
System.out.println("Product Total Price:" );
System.out.println("$" + totalProduct );
System.out.println("====================================================");
System.out.println("Gross Pay Amount: " + grossPay2);
System.out.println("Discount: $" + ((grossPay2)-discountPay));
System.out.println("After Discount: " + discountPay);

}

public static void exitProgram() {
	System.out.println("Answer for the total~!");
	
}
public static void exitProgram2() {
	System.out.println("Go HOME~!");
	
}
public static void reProgram() {
	for (int i=0; i<10;i++) {
		
		System.out.println("~~~~~~~~" + "Customer : " + (i+1) + "~~~~~~~~");
		
		
		nameACustomer();
		getProduct();
		
	
			
			//Option to continue 
		 String doYouWantToContinue;
			 Scanner choiceScanner = new Scanner(System.in);
			
			System.out.println("DO You Want to continue ...(type 'YES' OR 'no' to exit)");
			System.out.println("RESTART??");
			doYouWantToContinue = choiceScanner.nextLine();
			
			if (doYouWantToContinue.equals("no")) {
				welcomeBack();
				displayOutput();
		 exitProgram2();
		 break;
				
		} else if (doYouWantToContinue.equals("YES")){
			getProduct();
			grossPayAmount2();
			String doYouWantToContinue2;
			System.out.println("DO You Want to continue ...(type 'no' to exit)");
			
			doYouWantToContinue2 = boss.nextLine();
			
			if (doYouWantToContinue2.equals("no")) {
				
				welcomeBack();
				grossPayAmount2();
				discountPay();
				displayOutput2();
		 exitProgram2();
				continue;
		}else {
			break;
		} 			
			}
			welcomeBack();
			grossPayAmount();
			discountPay();
			displayOutput2();
	 exitProgram2();
	
	
	
	
} 
	
}
	public static void main(String[] args) {
		reProgram();
		}
	}


