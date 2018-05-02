package com.aadilanalytics.www;

//Java code to explain how to generate OTP
//Here we are using random() method of util class in Java
import java.util.*;


/*public class MyClass {
	public static void main(String[] args) {
		int length = 4;
		System.out.println(length);   //4
		System.out.println(Math.random());  //always generate unique double number.
	}
}*/


public class MyClass {
	static char[] OTP(int len) 
	{
		System.out.println("Generating OTP using random() : ");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) 
		    {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
			//System.out.print(otp[i]);
		        }
		return otp;
	}

	public static void main(String[] args) {
		int length = 6;        // otp generated and used to verify the transaction and authentication
		//int length = 4;      //otp generated and used in to verify mobile number
		System.out.println(OTP(length));
	}
}
