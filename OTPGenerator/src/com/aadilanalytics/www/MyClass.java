package com.aadilanalytics.www;

import java.security.SecureRandom;
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
		SecureRandom rndm_method = new SecureRandom();

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

/* Note:
 * 
Class SecureRandom

java.lang.Object
 java.util.Random
 java.security.SecureRandom
 
 
 
All Implemented Interfaces:Serializable

public class SecureRandom
extends Random

This class provides a cryptographically strong random number generator (RNG). 
A cryptographically strong random number minimally complies with the statistical random number generator tests specified in FIPS 140-2, Security Requirements for Cryptographic Modules, section 4.9.1. Additionally, SecureRandom must produce non-deterministic output. Therefore any seed material passed to a SecureRandom object must be unpredictable, and all SecureRandom output sequences must be cryptographically strong, as described in RFC 1750: Randomness Recommendations for Security. 

A caller obtains a SecureRandom instance via the no-argument constructor or one of the getInstance methods: 
      SecureRandom random = new SecureRandom();
 

Many SecureRandom implementations are in the form of a pseudo-random number generator (PRNG), which means they use a deterministic algorithm to produce a pseudo-random sequence from a true random seed. Other implementations may produce true random numbers, and yet others may use a combination of both techniques. 

Typical callers of SecureRandom invoke the following methods to retrieve random bytes: 
      SecureRandom random = new SecureRandom();
      byte bytes[] = new byte[20];
      random.nextBytes(bytes);
 

Callers may also invoke the generateSeed method to generate a given number of seed bytes (to seed other random number generators, for example): 
      byte seed[] = random.generateSeed(20);
 
Note: Depending on the implementation, the generateSeed and nextBytes methods may block as entropy is being gathered, for example, if they need to read from /dev/random on various Unix-like operating systems.
 */