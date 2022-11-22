package patikadev;

import java.util.Scanner;

public class UcakBiletiFiyatıHesaplama {

	public static void main(String[] args) {
		
		int km,age,flightType;
		double normalPrice,discountedPrice,ageDiscount = 0,typeDiscount;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please Enter The Distance(km):  ");
		
		km = input.nextInt();
		
		
		//Incorrect entry is prevented with while loops
		while(km<0) 
		{
			
			System.out.println("You Entered Wrong data");
			System.out.println("Please Enter The Distance(km):  ");
			km = input.nextInt();
		}
		
		System.out.println("Please Enter Your Age:  ");
		
		age = input.nextInt();
		
		while(age<0) 
		{
			
			System.out.println("You Entered Wrong data");
			System.out.println("Please Enter Your Age:  ");
			age = input.nextInt();
		}
		
		
		System.out.println("Please Enter Flight Type \n1-One Way \n2-Round Trip");
		flightType = input.nextInt();
		
		while(flightType<0) 
		{
			
			System.out.println("You Entered Wrong data");
			System.out.println("Please Enter Flight Type \n1-One Way \n2-Round Trip");
			flightType = input.nextInt();
		}
		
		normalPrice = km*0.1;
		
		if(age<12) 
		{
			ageDiscount = normalPrice * 0.5;
			
		}
		else if(age>12 && age <24) 
		{
			ageDiscount = normalPrice * 0.1;
			
			
		}
		else if(age>=65) 
		{
			ageDiscount = normalPrice * 0.3;
			
			
		}
		
		discountedPrice = normalPrice - ageDiscount;
		
		switch(flightType) 
		{
		
			case 1:
				System.out.println("Normal Price :"+normalPrice+"\nAge Discount : "+ageDiscount+"\nTotal Price : "+discountedPrice);
				break;
				
			case 2:
				typeDiscount=discountedPrice*0.2;
				System.out.println("Normal Price :"+normalPrice+"\nAge Discount : "+ageDiscount+"\nDiscounted Price : "+discountedPrice+"\nRound-Trip Discount : "+typeDiscount+"\nTotal Price : "+(discountedPrice-typeDiscount));
				break;
		}
		
	}

}
